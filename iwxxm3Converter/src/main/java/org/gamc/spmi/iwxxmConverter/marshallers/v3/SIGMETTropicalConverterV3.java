package org.gamc.spmi.iwxxmConverter.marshallers.v3;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import java.util.function.Consumer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import org.gamc.gis.model.GTCalculatedRegion;
import org.gamc.gis.model.GTCoordPoint;
import org.gamc.gis.model.GTDirectionFromLine;
import org.gamc.gis.service.GeoServiceException;
import org.gamc.spmi.iwxxmConverter.common.CoordPoint;
import org.gamc.spmi.iwxxmConverter.common.DirectionFromLine;
import org.gamc.spmi.iwxxmConverter.common.NamespaceMapper;
import org.gamc.spmi.iwxxmConverter.common.StringConstants;
import org.gamc.spmi.iwxxmConverter.exceptions.ParsingException;
import org.gamc.spmi.iwxxmConverter.iwxxmenums.ANGLE_UNITS;
import org.gamc.spmi.iwxxmConverter.tac.TacConverter;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import schemabindings31._int.icao.iwxxm._3.AbstractTimeObjectPropertyType;
import schemabindings31._int.icao.iwxxm._3.AeronauticalSignificantWeatherPhenomenonType;
import schemabindings31._int.icao.iwxxm._3.AirspacePropertyType;
import schemabindings31._int.icao.iwxxm._3.AirspaceVolumePropertyType;
import schemabindings31._int.icao.iwxxm._3.AngleWithNilReasonType;
import schemabindings31._int.icao.iwxxm._3.ExpectedIntensityChangeType;
import schemabindings31._int.icao.iwxxm._3.PermissibleUsageReasonType;
import schemabindings31._int.icao.iwxxm._3.PermissibleUsageType;
import schemabindings31._int.icao.iwxxm._3.ReportStatusType;
import schemabindings31._int.icao.iwxxm._3.SIGMETEvolvingConditionPropertyType;
import schemabindings31._int.icao.iwxxm._3.SIGMETEvolvingConditionType;
import schemabindings31._int.icao.iwxxm._3.SIGMETPositionPropertyType;
import schemabindings31._int.icao.iwxxm._3.SIGMETPositionType;
import schemabindings31._int.icao.iwxxm._3.SIGMETType;
import schemabindings31._int.icao.iwxxm._3.StringWithNilReasonType;
import schemabindings31._int.icao.iwxxm._3.TimeIndicatorType;
import schemabindings31._int.icao.iwxxm._3.TropicalCycloneSIGMETEvolvingConditionCollectionType;
import schemabindings31._int.icao.iwxxm._3.TropicalCycloneSIGMETPositionCollectionType;
import schemabindings31._int.icao.iwxxm._3.TropicalCycloneSIGMETPropertyType;
import schemabindings31._int.icao.iwxxm._3.TropicalCycloneSIGMETType;
import schemabindings31._int.icao.iwxxm._3.UnitPropertyType;
import schemabindings31._int.wmo.def.metce._2013.TropicalCyclonePropertyType;
import schemabindings31._int.wmo.def.metce._2013.TropicalCycloneType;
import schemabindings31.aero.aixm.schema._5_1.AirspaceTimeSlicePropertyType;
import schemabindings31.aero.aixm.schema._5_1.AirspaceTimeSliceType;
import schemabindings31.aero.aixm.schema._5_1.AirspaceType;
import schemabindings31.aero.aixm.schema._5_1.AirspaceVolumeType;
import schemabindings31.aero.aixm.schema._5_1.CodeAirspaceDesignatorType;
import schemabindings31.aero.aixm.schema._5_1.CodeAirspaceType;
import schemabindings31.aero.aixm.schema._5_1.CodeVerticalReferenceType;
import schemabindings31.aero.aixm.schema._5_1.SurfacePropertyType;
import schemabindings31.aero.aixm.schema._5_1.SurfaceType;
import schemabindings31.aero.aixm.schema._5_1.TextNameType;
import schemabindings31.aero.aixm.schema._5_1.UnitTimeSlicePropertyType;
import schemabindings31.aero.aixm.schema._5_1.UnitTimeSliceType;
import schemabindings31.aero.aixm.schema._5_1.UnitType;
import schemabindings31.aero.aixm.schema._5_1.ValDistanceVerticalType;
import schemabindings31.net.opengis.gml.v_3_2_1.AbstractRingPropertyType;
import schemabindings31.net.opengis.gml.v_3_2_1.AssociationRoleType;
import schemabindings31.net.opengis.gml.v_3_2_1.CircleByCenterPointType;
import schemabindings31.net.opengis.gml.v_3_2_1.CodeType;
import schemabindings31.net.opengis.gml.v_3_2_1.CurvePropertyType;
import schemabindings31.net.opengis.gml.v_3_2_1.CurveSegmentArrayPropertyType;
import schemabindings31.net.opengis.gml.v_3_2_1.CurveType;
import schemabindings31.net.opengis.gml.v_3_2_1.DirectPositionType;
import schemabindings31.net.opengis.gml.v_3_2_1.LengthType;
import schemabindings31.net.opengis.gml.v_3_2_1.PointType;
import schemabindings31.net.opengis.gml.v_3_2_1.PolygonPatchType;
import schemabindings31.net.opengis.gml.v_3_2_1.RingType;
import schemabindings31.net.opengis.gml.v_3_2_1.SpeedType;
import schemabindings31.net.opengis.gml.v_3_2_1.StringOrRefType;
import schemabindings31.net.opengis.gml.v_3_2_1.SurfacePatchArrayPropertyType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimeInstantPropertyType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimePrimitivePropertyType;

public class SIGMETTropicalConverterV3
		implements TacConverter<SIGMETTropicalTacMessage, TropicalCycloneSIGMETType, IWXXM31Helpers> {
	private TreeMap<String, String> createdRunways = new TreeMap<>();
	String airTrafficUnit = "FIC";
	String watchOfficeType = "MWO";
	String firType = "OTHER:FIR_UIR";
	String interpretation = "SNAPSHOT";

	IWXXM31Helpers iwxxmHelpers = new IWXXM31Helpers();
	private String dateTime = "";
	private String dateTimePosition = "";
	private SIGMETTropicalTacMessage translatedSigmet;

	Logger logger = LoggerFactory.getLogger(SIGMETTropicalConverterV3.class);

	@Override
	public String convertTacToXML(String tac)
			throws UnsupportedEncodingException, DatatypeConfigurationException, JAXBException {
		createdRunways.clear();

		SIGMETTropicalTacMessage sigmetMessage = new SIGMETTropicalTacMessage(tac);

		TropicalCycloneSIGMETType result;

		try {
			sigmetMessage.parseMessage();
			result = convertMessage(sigmetMessage);
		} catch (ParsingException pa) {
			result = iwxxmHelpers.getOfIWXXM().createTropicalCycloneSIGMETType();
			result.setTranslationFailedTAC(tac);

		}

		String xmlResult = marshallMessageToXML(result);

		return xmlResult;
	}

	@Override
	public TropicalCycloneSIGMETType convertMessage(SIGMETTropicalTacMessage translatedMessage)
			throws DatatypeConfigurationException, UnsupportedEncodingException, JAXBException, ParsingException {
		this.translatedSigmet = translatedMessage;
		StringOrRefType refTacString = iwxxmHelpers.getOfGML().createStringOrRefType();
		TimeInstantPropertyType obsTimeType = iwxxmHelpers.createTimeInstantPropertyTypeForDateTime(
				translatedSigmet.getMessageIssueDateTime(), translatedSigmet.getIcaoCode(), "issue");
		StringWithNilReasonType seq = iwxxmHelpers.getOfIWXXM().createStringWithNilReasonType();
		TropicalCycloneSIGMETPropertyType tropProp = iwxxmHelpers.getOfIWXXM()
				.createTropicalCycloneSIGMETPropertyType();
		TropicalCycloneSIGMETType sigmetRootTagCycl = iwxxmHelpers.getOfIWXXM().createTropicalCycloneSIGMETType();
		tropProp.setTropicalCycloneSIGMET(sigmetRootTagCycl);
		refTacString.setValue(translatedMessage.getInitialTacString());
		sigmetRootTagCycl.setDescription(refTacString);
		sigmetRootTagCycl = addTranslationCentreHeader(sigmetRootTagCycl);
		dateTime = translatedMessage.getMessageIssueDateTime().toString(iwxxmHelpers.getDateTimeFormat()) + "Z";
		dateTimePosition = translatedMessage.getMessageIssueDateTime().toString(iwxxmHelpers.getDateTimeISOFormat());
		// Id with ICAO code and current timestamp
		sigmetRootTagCycl.setId(
				iwxxmHelpers.generateUUIDv4(String.format("sigmet-%s-%s", translatedSigmet.getIcaoCode(), dateTime)));
		// sigmetRootTag.setAutomatedStation(true);
		// Set NON_OPERATIONAL and TEST properties.
		sigmetRootTagCycl.setPermissibleUsage(PermissibleUsageType.NON_OPERATIONAL);
		sigmetRootTagCycl.setPermissibleUsageReason(PermissibleUsageReasonType.TEST);
		// Some description
		sigmetRootTagCycl.setPermissibleUsageSupplementary("SIGMET composing test using JAXB");
		// COR, NIL, NORMAL
		switch (translatedSigmet.getMessageStatusType()) {
		case MISSING:
			sigmetRootTagCycl.setReportStatus(null);
			break;
		case CORRECTION:
			sigmetRootTagCycl.setReportStatus(ReportStatusType.CORRECTION);
			break;

		default:
			sigmetRootTagCycl.setReportStatus(ReportStatusType.NORMAL);
		}

		sigmetRootTagCycl.setIssueTime(obsTimeType);
		seq.setValue(translatedSigmet.getSigmetNumber());
		sigmetRootTagCycl.setSequenceNumber(seq);
		sigmetRootTagCycl.setIssuingAirTrafficServicesUnit(createUnitPropertyTypeNode(translatedSigmet.getIcaoCode(),
				translatedSigmet.getIcaoCode(), airTrafficUnit, interpretation));
		sigmetRootTagCycl.setIssuingAirTrafficServicesRegion(createAirspacePropertyTypeNode(
				translatedSigmet.getIcaoCode(), translatedSigmet.getFirName(), firType, interpretation));
		sigmetRootTagCycl.setOriginatingMeteorologicalWatchOffice(createUnitPropertyTypeNode(
				translatedSigmet.getIcaoCode(), translatedSigmet.getWatchOffice(), watchOfficeType, interpretation));
		sigmetRootTagCycl.setValidPeriod(iwxxmHelpers.createTimePeriod(translatedSigmet.getIcaoCode(),
				translatedSigmet.getValidFrom(), translatedSigmet.getValidTo()));
		switch (translatedMessage.getMessageStatusType()) {
		case CANCEL:
			sigmetRootTagCycl.setCancelledReportSequenceNumber(translatedSigmet.getCancelSigmetNumber());
			sigmetRootTagCycl.setCancelledReportValidPeriod(iwxxmHelpers.createTimePeriod(
					translatedSigmet.getIcaoCode(), translatedSigmet.getCancelSigmetDateTimeFrom(),
					translatedSigmet.getCancelSigmetDateTimeTo()));
			break;

		default:
			sigmetRootTagCycl.getAnalysis().add(setAssociationRoleType());
			sigmetRootTagCycl.getForecastPositionAnalysis().add(setForecastPositionAnalysis());
			sigmetRootTagCycl.getTropicalCyclone().add(setTropCyclone());
			break;

		}
		return sigmetRootTagCycl;
	}

	public AssociationRoleType setForecastPositionAnalysis() {
		//List<GTCalculatedRegion> listCoordTrop = getForacastGTCalculatedRegions();
		// -----------------createAirspaceVolumePropertyType-----------------------------------------------------------
		AirspaceVolumePropertyType air = iwxxmHelpers.getOfIWXXM().createAirspaceVolumePropertyType();
		air.getNilReason().add("http://codes.wmo.int/common/nil/inapplicable");
		// -----------------createSIGMETPositionType-----------------------------------------------------------
		SIGMETPositionType sigPos = iwxxmHelpers.getOfIWXXM().createSIGMETPositionType();
		sigPos.setGeometry(air);
		// -----------------createSIGMETPositionPropertyType-----------------------------------------------------------
		SIGMETPositionPropertyType evolvingTypeProp = iwxxmHelpers.getOfIWXXM().createSIGMETPositionPropertyType();
		evolvingTypeProp.setSIGMETPosition(sigPos);
		// -----------------createTropicalCycloneSIGMETPositionCollectionType----------------------------------
		TropicalCycloneSIGMETPositionCollectionType siColTrop = iwxxmHelpers.getOfIWXXM()
				.createTropicalCycloneSIGMETPositionCollectionType();
		siColTrop.setId(iwxxmHelpers.generateUUIDv4(String.format("unit-%s-ts", translatedSigmet.getIcaoCode())));
		siColTrop.getMember().add(evolvingTypeProp);
		// -----------------createPoint----------------------------------
		schemabindings31.aero.aixm.schema._5_1.PointType point = new schemabindings31.aero.aixm.schema._5_1.PointType();
		DirectPositionType dir = iwxxmHelpers.getOfGML().createDirectPositionType();
		point.getAxisLabels().add("Lat");
		point.getAxisLabels().add("Long");
		point.setSrsDimension(BigInteger.valueOf(2));
		point.setSrsName("http://www.opengis.net/def/crs/EPSG/0/4326");
		point.setId(iwxxmHelpers.generateUUIDv4("Point-" + translatedSigmet.getIcaoCode()));
		dir.getValue().add(27.6667);
		dir.getValue().add(-73.75);
		point.setPos(dir);
		JAXBElement<schemabindings31.aero.aixm.schema._5_1.PointType> pointj = iwxxmHelpers.getOfAIXM().createPoint(point);
		// -----------------createPointPropertyType----------------------------------
		schemabindings31.aero.aixm.schema._5_1.PointPropertyType pntProp = new schemabindings31.aero.aixm.schema._5_1.PointPropertyType();
		pntProp.setPoint(pointj);
		JAXBElement<schemabindings31.aero.aixm.schema._5_1.PointPropertyType> pointPropType = iwxxmHelpers.getOfIWXXM()
				.createTropicalCycloneSIGMETPositionCollectionTypeTropicalCyclonePosition(pntProp);
		siColTrop.getRest().add(pointPropType);
		// -----------------createAbstractTimeObject----------------------------------
		AbstractTimeObjectPropertyType analysisTimeProperty = iwxxmHelpers.createAbstractTimeObject(
				translatedSigmet.getPhenomenonDescription().getPhenomenonTimeStamp(), translatedSigmet.getIcaoCode());
		siColTrop.setPhenomenonTime(analysisTimeProperty);
		// -----------------createTropicalCycloneSIGMETPositionCollection----------------------------------
		JAXBElement<TropicalCycloneSIGMETPositionCollectionType> evolvingTropArTrop = iwxxmHelpers.getOfIWXXM()
				.createTropicalCycloneSIGMETPositionCollection(siColTrop);
		// -----------------createAssociationRoleType----------------------------------
		AssociationRoleType asType = iwxxmHelpers.getOfGML().createAssociationRoleType();
		asType.setAny(evolvingTropArTrop);
		return asType;
	}

	private TropicalCyclonePropertyType setTropCyclone() {
		// -----------------createCodeType-----------------------------------------------------------
		CodeType code = iwxxmHelpers.getOfGML().createCodeType();
		code.setValue("Gloria");
		// -----------------createTropicalCycloneType-----------------------------------------------------------
		TropicalCycloneType trType = new TropicalCycloneType();
		trType.setId(iwxxmHelpers.generateUUIDv4(String.format("unit-%s-ts", translatedSigmet.getIcaoCode())));
		trType.getName().add(code);
		// -----------------createTropicalCyclonePropertyType-----------------------------------------------------------
		TropicalCyclonePropertyType tropCyc = new TropicalCyclonePropertyType();
		tropCyc.setTropicalCyclone(trType);
		return tropCyc;
	}

	public AssociationRoleType setAssociationRoleType() {
		// ---------------Association Role----------------//
		AssociationRoleType asType = iwxxmHelpers.getOfGML().createAssociationRoleType();
		// ---------------AirspaceVolumePropertyType----------------//
		AirspaceVolumePropertyType air = iwxxmHelpers.getOfIWXXM().createAirspaceVolumePropertyType();
		List<GTCalculatedRegion> listCoord = getGTCalculatedRegions();
		air.setAirspaceVolume(createAirSpaceVolumeSection(listCoord));
		// ---------------SIGMETEvolvingConditionType(Time)----------------//
		AbstractTimeObjectPropertyType analysisTimeProperty = iwxxmHelpers.createAbstractTimeObject(
				translatedSigmet.getPhenomenonDescription().getPhenomenonTimeStamp(), translatedSigmet.getIcaoCode());
		// ---------------SIGMETEvolvingConditionType----------------//
		SIGMETEvolvingConditionPropertyType evolvingTypeProp = iwxxmHelpers.getOfIWXXM()
				.createSIGMETEvolvingConditionPropertyType();
		// ---------------SIGMETEvolvingConditionType----------------//
		SIGMETEvolvingConditionType evolvingType = iwxxmHelpers.getOfIWXXM().createSIGMETEvolvingConditionType();
		TropicalCycloneSIGMETEvolvingConditionCollectionType siTropCol = iwxxmHelpers.getOfIWXXM()
				.createTropicalCycloneSIGMETEvolvingConditionCollectionType();
		JAXBElement<TropicalCycloneSIGMETEvolvingConditionCollectionType> evolvingTropAr = iwxxmHelpers.getOfIWXXM()
				.createTropicalCycloneSIGMETEvolvingConditionCollection(siTropCol);
		evolvingType.setGeometry(air);
		siTropCol.setId(iwxxmHelpers.generateUUIDv4(String.format("unit-%s-ts", translatedSigmet.getIcaoCode())));
		// ---------------SIGMETEvolvingConditionType(PhenomenonObservation)----------------//
		if (translatedSigmet.getPhenomenonDescription().getPhenomenonObservation().name().equals("FCST")) {
			siTropCol.setTimeIndicator(TimeIndicatorType.FORECAST);
		} else if (translatedSigmet.getPhenomenonDescription().getPhenomenonObservation().name().equals("OBS")) {
			siTropCol.setTimeIndicator(TimeIndicatorType.OBSERVATION);
		}
		evolvingTypeProp.setSIGMETEvolvingCondition(evolvingType);
		siTropCol.getMember().add(evolvingTypeProp);
		siTropCol.setPhenomenonTime(analysisTimeProperty);

		PointType point = iwxxmHelpers.getOfGML().createPointType();
		DirectPositionType dir = iwxxmHelpers.getOfGML().createDirectPositionType();
		for (GTCalculatedRegion gtCoordsRegion : listCoord) {
			LinkedList<Double> coords = gtCoordsRegion.getCoordinates();
			for (Double dbEntry : coords) {
				dir.getValue().add(dbEntry);
			}
		}
		point.setPos(dir);
		JAXBElement<PointType> pointj = iwxxmHelpers.getOfGML().createPoint(point);
		TropicalCycloneSIGMETPositionCollectionType tropPosColl = iwxxmHelpers.getOfIWXXM()
				.createTropicalCycloneSIGMETPositionCollectionType();
		JAXBElement<TropicalCycloneSIGMETPositionCollectionType> tropCyclArColl = iwxxmHelpers.getOfIWXXM()
				.createTropicalCycloneSIGMETPositionCollection(tropPosColl);
		tropPosColl.getRest().add(pointj);
		siTropCol.getRest().add(tropCyclArColl);
		asType.setAny(evolvingTropAr);
		// ---------------SIGMETEvolvingConditionType(Speed-Motion-Id-Intencity)----------------//
		SpeedType speedType = iwxxmHelpers.getOfGML().createSpeedType();
		if (translatedSigmet.getPhenomenonDescription().getMovingSection() != null
				&& translatedSigmet.getPhenomenonDescription().getMovingSection().isMoving()) {
			AngleWithNilReasonType motion = iwxxmHelpers.getOfIWXXM().createAngleWithNilReasonType();
			JAXBElement<AngleWithNilReasonType> dirMo = iwxxmHelpers.getOfIWXXM()
					.createSIGMETEvolvingConditionTypeDirectionOfMotion(motion);

			motion.setUom(ANGLE_UNITS.DEGREES.getStringValue());
			motion.setValue(translatedSigmet.getPhenomenonDescription().getMovingSection().getMovingDirection()
					.getDoubleValue());

			evolvingType.setDirectionOfMotion(dirMo);

			if (translatedSigmet.getPhenomenonDescription().getMovingSection().getSpeedUnits() != null
					&& translatedSigmet.getPhenomenonDescription().getMovingSection().getMovingSpeed() > 0) {
				speedType.setUom(translatedSigmet.getPhenomenonDescription().getMovingSection().getSpeedUnits()
						.getStringValue());
				speedType.setValue(translatedSigmet.getPhenomenonDescription().getMovingSection().getMovingSpeed());
				evolvingType.setSpeedOfMotion(speedType);
			}
		}
		evolvingType.setId(iwxxmHelpers.generateUUIDv4(String.format("unit-%s-ts", translatedSigmet.getIcaoCode())));
		if (translatedSigmet.getPhenomenonDescription().getIntencity().name().equals("INTSF")) {
			evolvingType.setIntensityChange(ExpectedIntensityChangeType.INTENSIFY);
		} else if (translatedSigmet.getPhenomenonDescription().getIntencity().name().equals("WKN")) {
			evolvingType.setIntensityChange(ExpectedIntensityChangeType.WEAKEN);
		} else if (translatedSigmet.getPhenomenonDescription().getIntencity().name().equals("NC")) {
			evolvingType.setIntensityChange(ExpectedIntensityChangeType.NO_CHANGE);
		}
		return asType;
	}

	/**
	 * Coordinates calculation
	 * 
	 * @throws GeoServiceException
	 * 
	 * @throws URISyntaxException
	 */
	public List<GTCalculatedRegion> getGTCalculatedRegions() {

		try {
			// Sigmet phenomena within polygon (WI)
			if (translatedSigmet.getHorizontalLocation().isInPolygon()) {
				LinkedList<GTCoordPoint> listPolygonPoints = new LinkedList<GTCoordPoint>();
				translatedSigmet.getHorizontalLocation().getPolygonPoints().stream()
						.forEach(new Consumer<CoordPoint>() {

							@Override
							public void accept(CoordPoint arg0) {

								listPolygonPoints.add(arg0.toGTCoordPoint());
							}
						});
				if (listPolygonPoints.size() > 0)
					return iwxxmHelpers.getGeoService().recalcFromPolygon(translatedSigmet.getFirCode(),
							listPolygonPoints);
			}

			if (translatedSigmet.getHorizontalLocation().isEntireFIR()) {
				throw new IllegalArgumentException("NOT IMPLEMENTED YET");
			}

			if (translatedSigmet.getHorizontalLocation().isWithinCorridor()) {
				throw new IllegalArgumentException("NOT IMPLEMENTED YET");
			}
			if (translatedSigmet.getHorizontalLocation().isWithinRadius()) {
				throw new IllegalArgumentException("NOT IMPLEMENTED YET");
			}

			LinkedList<GTDirectionFromLine> listLines = new LinkedList<GTDirectionFromLine>();
			translatedSigmet.getHorizontalLocation().getDirectionsFromLines().stream()
					.forEach(new Consumer<DirectionFromLine>() {

						@Override
						public void accept(DirectionFromLine arg0) {

							listLines.add(arg0.toGTDirectionFromLine());
						}
					});
			if (listLines.size() > 0)
				return iwxxmHelpers.getGeoService().recalcFromLines(translatedSigmet.getFirCode(), listLines);
		} catch (URISyntaxException e) {
			logger.error("Unable to calculate coordinates", e);
		} catch (GeoServiceException e) {
			logger.error("Unable to calculate coordinates", e);
		}

		return new LinkedList<GTCalculatedRegion>();

	};

	/** returns section for airspaceVolumeDescription */
	public AirspaceVolumeType createAirSpaceVolumeSection(List<GTCalculatedRegion> coordsRegion) {

		AirspaceVolumeType airspaceVolumeType = iwxxmHelpers.getOfAIXM().createAirspaceVolumeType();
		airspaceVolumeType.setId(iwxxmHelpers.generateUUIDv4("airspace-" + translatedSigmet.getIcaoCode()));

		// lower limit if exists and check if on surface
		if (translatedSigmet.getVerticalLocation().getBottomFL().isPresent()) {
			ValDistanceVerticalType bottomFlType = iwxxmHelpers.getOfAIXM().createValDistanceVerticalType();

			bottomFlType.setUom("FL");
			bottomFlType.setValue(String.valueOf(translatedSigmet.getVerticalLocation().getBottomFL().get()));
			JAXBElement<ValDistanceVerticalType> bottomFlSection = iwxxmHelpers.getOfAIXM()
					.createAirspaceLayerTypeLowerLimit(bottomFlType);
			airspaceVolumeType.setLowerLimit(bottomFlSection);

			CodeVerticalReferenceType valueCode = iwxxmHelpers.getOfAIXM().createCodeVerticalReferenceType();
			valueCode.setValue("STD");
			JAXBElement<CodeVerticalReferenceType> vertCodeType = iwxxmHelpers.getOfAIXM()
					.createAirspaceLayerTypeLowerLimitReference(valueCode);
			airspaceVolumeType.setLowerLimitReference(vertCodeType);
		}

		// upper limit if exists
		if (translatedSigmet.getVerticalLocation().getTopFL().isPresent()) {

			ValDistanceVerticalType topFlType = iwxxmHelpers.getOfAIXM().createValDistanceVerticalType();
			topFlType.setUom("FL");

			if (translatedSigmet.getVerticalLocation().isTopMarginAboveFl()) {

				ValDistanceVerticalType unknownType = iwxxmHelpers.getOfAIXM().createValDistanceVerticalType();
				unknownType.setNilReason(iwxxmHelpers.getNilRegister().getWMOUrlByCode("unknown"));
				JAXBElement<ValDistanceVerticalType> unknownSection = iwxxmHelpers.getOfAIXM()
						.createAirspaceLayerTypeUpperLimit(unknownType);
				airspaceVolumeType.setMaximumLimit(unknownSection);
				topFlType.setValue(String.valueOf(translatedSigmet.getVerticalLocation().getTopFL().get()));
			}
			// Below top fl - set max as top fl, set upper as unknown
			else if (translatedSigmet.getVerticalLocation().isTopMarginBelowFl()) {

				ValDistanceVerticalType topMaxType = iwxxmHelpers.getOfAIXM().createValDistanceVerticalType();
				topMaxType.setValue(String.valueOf(translatedSigmet.getVerticalLocation().getTopFL().get()));

				JAXBElement<ValDistanceVerticalType> topMaxSection = iwxxmHelpers.getOfAIXM()
						.createAirspaceLayerTypeUpperLimit(topMaxType);
				airspaceVolumeType.setMaximumLimit(topMaxSection);

				topFlType.setNilReason(iwxxmHelpers.getNilRegister().getWMOUrlByCode("unknown"));
			} else {
				topFlType.setValue(String.valueOf(translatedSigmet.getVerticalLocation().getTopFL().get()));
			}

			JAXBElement<ValDistanceVerticalType> topFlSection = iwxxmHelpers.getOfAIXM()
					.createAirspaceLayerTypeUpperLimit(topFlType);
			airspaceVolumeType.setUpperLimit(topFlSection);

			CodeVerticalReferenceType valueCode = iwxxmHelpers.getOfAIXM().createCodeVerticalReferenceType();
			valueCode.setValue("STD");
			JAXBElement<CodeVerticalReferenceType> vertCodeType = iwxxmHelpers.getOfAIXM()
					.createAirspaceLayerTypeUpperLimitReference(valueCode);
			airspaceVolumeType.setUpperLimitReference(vertCodeType);

		}

		// if height is observed in feet or meters and low bound is on surface
		if (translatedSigmet.getVerticalLocation().isBottomMarginOnSurface()
				&& translatedSigmet.getVerticalLocation().getTopMarginMeters().isPresent()) {
			ValDistanceVerticalType bottomFlType = iwxxmHelpers.getOfAIXM().createValDistanceVerticalType();
			bottomFlType.setUom(translatedSigmet.getVerticalLocation().getUnits().getStringValue());
			bottomFlType.setValue("0");
			JAXBElement<ValDistanceVerticalType> bottomFlSection = iwxxmHelpers.getOfAIXM()
					.createAirspaceLayerTypeUpperLimit(bottomFlType);
			airspaceVolumeType.setLowerLimit(bottomFlSection);

			ValDistanceVerticalType topHeightType = iwxxmHelpers.getOfAIXM().createValDistanceVerticalType();
			topHeightType.setUom(translatedSigmet.getVerticalLocation().getUnits().getStringValue());
			topHeightType.setValue(String.valueOf(translatedSigmet.getVerticalLocation().getTopMarginMeters().get()));
			JAXBElement<ValDistanceVerticalType> bottomHeightSection = iwxxmHelpers.getOfAIXM()
					.createAirspaceLayerTypeUpperLimit(topHeightType);
			airspaceVolumeType.setLowerLimit(bottomHeightSection);

			// set flag from SURFACE - see aixm 5.1.1
			CodeVerticalReferenceType valueCodeSfc = iwxxmHelpers.getOfAIXM().createCodeVerticalReferenceType();
			valueCodeSfc.setValue("SFC");
			JAXBElement<CodeVerticalReferenceType> vertCodeTypeSfc = iwxxmHelpers.getOfAIXM()
					.createAirspaceLayerTypeUpperLimitReference(valueCodeSfc);

			CodeVerticalReferenceType valueCodeStd = iwxxmHelpers.getOfAIXM().createCodeVerticalReferenceType();
			valueCodeSfc.setValue("STD");
			JAXBElement<CodeVerticalReferenceType> vertCodeTypeStd = iwxxmHelpers.getOfAIXM()
					.createAirspaceLayerTypeUpperLimitReference(valueCodeStd);

			airspaceVolumeType.setUpperLimitReference(vertCodeTypeStd);
			airspaceVolumeType.setLowerLimitReference(vertCodeTypeSfc);
		}

		// create projection
		SurfacePropertyType surfaceSection = iwxxmHelpers.getOfAIXM().createSurfacePropertyType();
		SurfaceType sfType = iwxxmHelpers.getOfAIXM().createSurfaceType();
		sfType.getAxisLabels().add("Lat");
		sfType.getAxisLabels().add("Long");
		sfType.setSrsDimension(BigInteger.valueOf(2));
		sfType.setSrsName("http://www.opengis.net/def/crs/EPSG/0/4326");
		sfType.setId(iwxxmHelpers.generateUUIDv4("surface-" + translatedSigmet.getIcaoCode()));

		// add gml patches
		SurfacePatchArrayPropertyType patchArray = iwxxmHelpers.getOfGML().createSurfacePatchArrayPropertyType();
		AbstractRingPropertyType absRingType = iwxxmHelpers.getOfGML().createAbstractRingPropertyType();
		// Create patch for all coordinate regions

		// create polygon
		PolygonPatchType patchType = iwxxmHelpers.getOfGML().createPolygonPatchType();
		RingType ringType = iwxxmHelpers.getOfGML().createRingType();
		CurvePropertyType curveProp = iwxxmHelpers.getOfGML().createCurvePropertyType();
		// fill polygon with coords
		CurveSegmentArrayPropertyType curveSeg = iwxxmHelpers.getOfGML().createCurveSegmentArrayPropertyType();
		CircleByCenterPointType circle = iwxxmHelpers.getOfGML().createCircleByCenterPointType();
		DirectPositionType pos = iwxxmHelpers.getOfGML().createDirectPositionType();
		LengthType length = iwxxmHelpers.getOfGML().createLengthType();
		pos.getValue().add(27.10);
		pos.getValue().add(-73.10);
		length.setValue(250);
		length.setUom(ANGLE_UNITS.DEGREES.getStringValue());
		circle.setRadius(length);
		circle.setPos(pos);
		JAXBElement<CircleByCenterPointType> jaxCircle = iwxxmHelpers.getOfGML().createCircleByCenterPoint(circle);
		curveSeg.getAbstractCurveSegment().add(jaxCircle);
		CurveType cur = iwxxmHelpers.getOfGML().createCurveType();
		cur.setId(iwxxmHelpers.generateUUIDv4(String.format("unit-%s-%s", translatedSigmet.getIcaoCode(), dateTime)));
		JAXBElement<CurveType> curveType = iwxxmHelpers.getOfGML().createCurve(cur);
		curveProp.setAbstractCurve(curveType);
		cur.setSegments(curveSeg);
		// put polygon in the envelope
		JAXBElement<RingType> jaxRing = iwxxmHelpers.getOfGML().createRing(ringType);
		ringType.getCurveMember().add(curveProp);
		absRingType.setAbstractRing(jaxRing);
		patchType.setExterior(absRingType);

		JAXBElement<PolygonPatchType> patch = iwxxmHelpers.getOfGML().createPolygonPatch(patchType);

		patchArray.getAbstractSurfacePatch().add(patch);

		JAXBElement<SurfacePatchArrayPropertyType> pta = iwxxmHelpers.getOfGML().createPatches(patchArray);

		sfType.setPatches(pta);

		JAXBElement<SurfaceType> syrfaceElement = iwxxmHelpers.getOfAIXM().createSurface(sfType);
		surfaceSection.setSurface(syrfaceElement);
		JAXBElement<SurfacePropertyType> spt = iwxxmHelpers.getOfAIXM()
				.createAirspaceVolumeTypeHorizontalProjection(surfaceSection);
		// create aixm:horizontalProjection
		airspaceVolumeType.setHorizontalProjection(spt);

		return airspaceVolumeType;

	}

	/** Get link for WMO register record for the phenomena */
	public AeronauticalSignificantWeatherPhenomenonType setAeronauticalSignificantWeatherPhenomenonType() {
		AeronauticalSignificantWeatherPhenomenonType typePhen = iwxxmHelpers.getOfIWXXM()
				.createAeronauticalSignificantWeatherPhenomenonType();
		String link = iwxxmHelpers.getSigWxPhenomenaRegister()
				.getWMOUrlByCode(translatedSigmet.getPhenomenonDescription().getPhenomenonForLink());
		typePhen.setHref(link);
		return typePhen;

	}

	public UnitPropertyType createUnitPropertyTypeNode(String icaoCode, String firname, String type,
			String interpretation) {
		UnitPropertyType pt = iwxxmHelpers.getOfIWXXM().createUnitPropertyType();

		UnitType ut = iwxxmHelpers.getOfAIXM().createUnitType();
		ut.setId(iwxxmHelpers.generateUUIDv4(String.format("unit-%s-%s", icaoCode, firname)));

		pt.setUnit(ut);

		UnitTimeSlicePropertyType tspt = iwxxmHelpers.getOfAIXM().createUnitTimeSlicePropertyType();
		UnitTimeSliceType tst = iwxxmHelpers.getOfAIXM().createUnitTimeSliceType();
		tst.setId(iwxxmHelpers.generateUUIDv4(String.format("unit-%s-%s-ts", icaoCode, firname)));
		tst.setInterpretation(interpretation);

		// TODO: Ask the team if it is nessessary
		TimePrimitivePropertyType emptyTime = iwxxmHelpers.getOfGML().createTimePrimitivePropertyType();
		tst.setValidTime(emptyTime);

		tspt.setUnitTimeSlice(tst);

		/**
		 * <aixm:interpretation>SNAPSHOT</aixm:interpretation>
		 * <aixm:type>OTHER:FIR_UIR</aixm:type> <aixm:designator>YUDD</aixm:designator>
		 * <aixm:name>SHANLON FIR/UIR</aixm:name>
		 *
		 *
		 */

		// add name
		TextNameType nType = iwxxmHelpers.getOfAIXM().createTextNameType();
		nType.setValue(firname + " " + type);
		JAXBElement<TextNameType> ntType = iwxxmHelpers.getOfAIXM().createAirspaceTimeSliceTypeName(nType);
		tst.getRest().add(ntType);

		// add type
		CodeAirspaceType asType = iwxxmHelpers.getOfAIXM().createCodeAirspaceType();
		asType.setValue(type);
		JAXBElement<CodeAirspaceType> astType = iwxxmHelpers.getOfAIXM().createAirspaceTimeSliceTypeType(asType);
		tst.getRest().add(astType);

		// add designator
		CodeAirspaceDesignatorType cadType = iwxxmHelpers.getOfAIXM().createCodeAirspaceDesignatorType();
		cadType.setValue(firname);
		JAXBElement<CodeAirspaceDesignatorType> cast = iwxxmHelpers.getOfAIXM()
				.createAirspaceTimeSliceTypeDesignator(cadType);
		tst.getRest().add(cast);

		ut.getTimeSlice().add(tspt);

		return pt;
	}

	public List<GTCalculatedRegion> getForacastGTCalculatedRegions() {

		try {
			// Sigmet phenomena within polygon (WI)
			if (translatedSigmet.getfSection().getHorizontalLocation().isInPolygon()) {
				LinkedList<GTCoordPoint> listPolygonPoints = new LinkedList<GTCoordPoint>();
				translatedSigmet.getfSection().getHorizontalLocation().getPolygonPoints().stream()
						.forEach(new Consumer<CoordPoint>() {

							@Override
							public void accept(CoordPoint arg0) {

								listPolygonPoints.add(arg0.toGTCoordPoint());
							}
						});
				if (listPolygonPoints.size() > 0)
					return iwxxmHelpers.getGeoService().recalcFromPolygon(translatedSigmet.getFirCode(),
							listPolygonPoints);
			}

			if (translatedSigmet.getfSection().getHorizontalLocation().isEntireFIR()) {
				throw new IllegalArgumentException("NOT IMPLEMENTED YET");
			}

			if (translatedSigmet.getfSection().getHorizontalLocation().isWithinCorridor()) {
				throw new IllegalArgumentException("NOT IMPLEMENTED YET");
			}
			if (translatedSigmet.getfSection().getHorizontalLocation().isWithinRadius()) {
				throw new IllegalArgumentException("NOT IMPLEMENTED YET");
			}

			LinkedList<GTDirectionFromLine> listLines = new LinkedList<GTDirectionFromLine>();
			translatedSigmet.getfSection().getHorizontalLocation().getDirectionsFromLines().stream()
					.forEach(new Consumer<DirectionFromLine>() {

						@Override
						public void accept(DirectionFromLine arg0) {

							listLines.add(arg0.toGTDirectionFromLine());
						}
					});
			if (listLines.size() > 0)
				return iwxxmHelpers.getGeoService().recalcFromLines(translatedSigmet.getFirCode(), listLines);
		} catch (URISyntaxException e) {
			logger.error("Unable to calculate coordinates", e);
		} catch (GeoServiceException e) {
			logger.error("Unable to calculate coordinates", e);
		}

		return new LinkedList<GTCalculatedRegion>();

	};

	/** Airspace for issuing center */
	public AirspacePropertyType createAirspacePropertyTypeNode(String icaoCode, String firname, String type,
			String interpretation) {

		AirspacePropertyType pt = iwxxmHelpers.getOfIWXXM().createAirspacePropertyType();
		AirspaceType ast = iwxxmHelpers.getOfAIXM().createAirspaceType();
		ast.setId(iwxxmHelpers.generateUUIDv4(String.format("airspace-%s", icaoCode)));
		pt.setAirspace(ast);

		AirspaceTimeSlicePropertyType tsp = iwxxmHelpers.getOfAIXM().createAirspaceTimeSlicePropertyType();
		AirspaceTimeSliceType ts = iwxxmHelpers.getOfAIXM().createAirspaceTimeSliceType();
		ts.setId(iwxxmHelpers.generateUUIDv4(String.format("airspace-%s-ts", icaoCode)));

		// TODO: Ask the team if it is nessessary
		TimePrimitivePropertyType emptyTime = iwxxmHelpers.getOfGML().createTimePrimitivePropertyType();
		ts.setValidTime(emptyTime);

		ts.setInterpretation(interpretation);

		/**
		 * <aixm:interpretation>SNAPSHOT</aixm:interpretation>
		 * <aixm:type>OTHER:FIR_UIR</aixm:type> <aixm:designator>YUDD</aixm:designator>
		 * <aixm:name>SHANLON FIR/UIR</aixm:name>
		 *
		 *
		 */
		// add type
		CodeAirspaceType asType = iwxxmHelpers.getOfAIXM().createCodeAirspaceType();
		asType.setValue(type);
		JAXBElement<CodeAirspaceType> astType = iwxxmHelpers.getOfAIXM().createAirspaceTimeSliceTypeType(asType);
		ts.getRest().add(astType);

		// add designator
		CodeAirspaceDesignatorType cadType = iwxxmHelpers.getOfAIXM().createCodeAirspaceDesignatorType();
		cadType.setValue(icaoCode);
		JAXBElement<CodeAirspaceDesignatorType> cast = iwxxmHelpers.getOfAIXM()
				.createAirspaceTimeSliceTypeDesignator(cadType);
		ts.getRest().add(cast);

		// add name
		TextNameType nType = iwxxmHelpers.getOfAIXM().createTextNameType();
		nType.setValue(firname);
		JAXBElement<TextNameType> ntType = iwxxmHelpers.getOfAIXM().createAirspaceTimeSliceTypeName(nType);
		ts.getRest().add(ntType);

		tsp.setAirspaceTimeSlice(ts);

		ast.getTimeSlice().add(tsp);

		return pt;
	}

	@Override
	public TropicalCycloneSIGMETType addTranslationCentreHeader(TropicalCycloneSIGMETType report)
			throws DatatypeConfigurationException {
		report = iwxxmHelpers.addTranslationCentreHeaders(report, DateTime.now(), DateTime.now(),
				UUID.randomUUID().toString(), "UUWV", "Moscow, RU");
		// report.setTranslationFailedTAC("");
		return report;
	}

	@Override
	public String marshallMessageToXML(TropicalCycloneSIGMETType reportType)
			throws JAXBException, UnsupportedEncodingException {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();

		JAXBContext jaxbContext = JAXBContext.newInstance(SIGMETType.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, UriConstants.GLOBAL_SCHEMAS_LOCATION_V3);

		jaxbMarshaller.setProperty(StringConstants.SUN_JAXB_NAMESPACE_MAPPING_PROPERTY_NAME, new NamespaceMapper());

		JAXBElement<TropicalCycloneSIGMETType> sigmetRootElement = iwxxmHelpers.getOfIWXXM()
				.createTropicalCycloneSIGMET(reportType);

		jaxbMarshaller.marshal(sigmetRootElement, stream);

		return stream.toString("UTF-8");
	}

	@Override
	public IWXXM31Helpers getHelper() {
		return iwxxmHelpers;
	}

	@Override
	public SIGMETTropicalConverterV3 withHelper(IWXXM31Helpers helper) {
		this.iwxxmHelpers = helper;
		return this;

	}
}
