//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import _int.icao.iwxxm._3.AIRMETEvolvingConditionCollectionType;
import _int.icao.iwxxm._3.AIRMETEvolvingConditionType;
import _int.icao.iwxxm._3.AIRMETType;
import _int.icao.iwxxm._3.METARType;
import _int.icao.iwxxm._3.MeteorologicalAerodromeObservationReportType;
import _int.icao.iwxxm._3.ReportType;
import _int.icao.iwxxm._3.SIGMETEvolvingConditionCollectionType;
import _int.icao.iwxxm._3.SIGMETEvolvingConditionType;
import _int.icao.iwxxm._3.SIGMETPositionCollectionType;
import _int.icao.iwxxm._3.SIGMETPositionType;
import _int.icao.iwxxm._3.SIGMETType;
import _int.icao.iwxxm._3.SPECIType;
import _int.icao.iwxxm._3.SpaceWeatherAdvisoryType;
import _int.icao.iwxxm._3.SpaceWeatherAnalysisType;
import _int.icao.iwxxm._3.SpaceWeatherRegionType;
import _int.icao.iwxxm._3.TAFType;
import _int.icao.iwxxm._3.TropicalCycloneAdvisoryType;
import _int.icao.iwxxm._3.TropicalCycloneForecastConditionsType;
import _int.icao.iwxxm._3.TropicalCycloneObservedConditionsType;
import _int.icao.iwxxm._3.TropicalCycloneSIGMETEvolvingConditionCollectionType;
import _int.icao.iwxxm._3.TropicalCycloneSIGMETPositionCollectionType;
import _int.icao.iwxxm._3.TropicalCycloneSIGMETType;
import _int.icao.iwxxm._3.VolcanicAshAdvisoryType;
import _int.icao.iwxxm._3.VolcanicAshCloudForecastType;
import _int.icao.iwxxm._3.VolcanicAshCloudObservedOrEstimatedType;
import _int.icao.iwxxm._3.VolcanicAshForecastConditionsType;
import _int.icao.iwxxm._3.VolcanicAshObservedOrEstimatedConditionsType;
import _int.icao.iwxxm._3.VolcanicAshSIGMETEvolvingConditionCollectionType;
import _int.icao.iwxxm._3.VolcanicAshSIGMETPositionCollectionType;
import _int.icao.iwxxm._3.VolcanicAshSIGMETType;
import _int.icao.iwxxm._3.WindObservedOrEstimatedType;
import _int.wmo.def.metce._2013.EruptingVolcanoType;
import _int.wmo.def.metce._2013.ProcessType;
import _int.wmo.def.metce._2013.TropicalCycloneType;
import _int.wmo.def.metce._2013.VolcanoType;
import aero.aixm.schema._5_1.AbstractAIXMFeatureType;
import aero.aixm.schema._5_1.AbstractAirportGroundServiceType;
import aero.aixm.schema._5_1.AbstractAirportHeliportProtectionAreaType;
import aero.aixm.schema._5_1.AbstractApproachLegType;
import aero.aixm.schema._5_1.AbstractGroundLightSystemType;
import aero.aixm.schema._5_1.AbstractMarkingType;
import aero.aixm.schema._5_1.AbstractNavaidEquipmentType;
import aero.aixm.schema._5_1.AbstractNavigationSystemCheckpointType;
import aero.aixm.schema._5_1.AbstractProcedureType;
import aero.aixm.schema._5_1.AbstractRadarEquipmentType;
import aero.aixm.schema._5_1.AbstractSegmentLegType;
import aero.aixm.schema._5_1.AbstractServiceType;
import aero.aixm.schema._5_1.AbstractSurveillanceRadarType;
import aero.aixm.schema._5_1.AbstractTrafficSeparationServiceType;
import aero.aixm.schema._5_1.AerialRefuellingType;
import aero.aixm.schema._5_1.AeronauticalGroundLightType;
import aero.aixm.schema._5_1.AirTrafficControlServiceType;
import aero.aixm.schema._5_1.AirTrafficManagementServiceType;
import aero.aixm.schema._5_1.AircraftGroundServiceType;
import aero.aixm.schema._5_1.AircraftStandType;
import aero.aixm.schema._5_1.AirportClearanceServiceType;
import aero.aixm.schema._5_1.AirportHeliportCollocationType;
import aero.aixm.schema._5_1.AirportHeliportType;
import aero.aixm.schema._5_1.AirportHotSpotType;
import aero.aixm.schema._5_1.AirportProtectionAreaMarkingType;
import aero.aixm.schema._5_1.AirportSuppliesServiceType;
import aero.aixm.schema._5_1.AirspaceBorderCrossingType;
import aero.aixm.schema._5_1.AirspaceType;
import aero.aixm.schema._5_1.AltimeterSourceType;
import aero.aixm.schema._5_1.AngleIndicationType;
import aero.aixm.schema._5_1.ApproachLightingSystemType;
import aero.aixm.schema._5_1.ApronElementType;
import aero.aixm.schema._5_1.ApronLightSystemType;
import aero.aixm.schema._5_1.ApronMarkingType;
import aero.aixm.schema._5_1.ApronType;
import aero.aixm.schema._5_1.ArrestingGearType;
import aero.aixm.schema._5_1.ArrivalFeederLegType;
import aero.aixm.schema._5_1.ArrivalLegType;
import aero.aixm.schema._5_1.AuthorityForAirspaceType;
import aero.aixm.schema._5_1.AzimuthType;
import aero.aixm.schema._5_1.ChangeOverPointType;
import aero.aixm.schema._5_1.CheckpointINSType;
import aero.aixm.schema._5_1.CheckpointVORType;
import aero.aixm.schema._5_1.CirclingAreaType;
import aero.aixm.schema._5_1.DMEType;
import aero.aixm.schema._5_1.DeicingAreaMarkingType;
import aero.aixm.schema._5_1.DeicingAreaType;
import aero.aixm.schema._5_1.DepartureLegType;
import aero.aixm.schema._5_1.DesignatedPointType;
import aero.aixm.schema._5_1.DirectionFinderType;
import aero.aixm.schema._5_1.DistanceIndicationType;
import aero.aixm.schema._5_1.ElevationType;
import aero.aixm.schema._5_1.FinalLegType;
import aero.aixm.schema._5_1.FireFightingServiceType;
import aero.aixm.schema._5_1.FlightRestrictionType;
import aero.aixm.schema._5_1.FloatingDockSiteType;
import aero.aixm.schema._5_1.GeoBorderType;
import aero.aixm.schema._5_1.GlidepathType;
import aero.aixm.schema._5_1.GroundTrafficControlServiceType;
import aero.aixm.schema._5_1.GuidanceLineLightSystemType;
import aero.aixm.schema._5_1.GuidanceLineMarkingType;
import aero.aixm.schema._5_1.GuidanceLineType;
import aero.aixm.schema._5_1.HoldingAssessmentType;
import aero.aixm.schema._5_1.HoldingPatternType;
import aero.aixm.schema._5_1.InformationServiceType;
import aero.aixm.schema._5_1.InitialLegType;
import aero.aixm.schema._5_1.InstrumentApproachProcedureType;
import aero.aixm.schema._5_1.IntermediateLegType;
import aero.aixm.schema._5_1.LocalizerType;
import aero.aixm.schema._5_1.MarkerBeaconType;
import aero.aixm.schema._5_1.MarkingBuoyType;
import aero.aixm.schema._5_1.MissedApproachLegType;
import aero.aixm.schema._5_1.NDBType;
import aero.aixm.schema._5_1.NavaidType;
import aero.aixm.schema._5_1.NavigationAreaRestrictionType;
import aero.aixm.schema._5_1.NavigationAreaType;
import aero.aixm.schema._5_1.NonMovementAreaType;
import aero.aixm.schema._5_1.ObstacleAreaType;
import aero.aixm.schema._5_1.OrganisationAuthorityType;
import aero.aixm.schema._5_1.PassengerLoadingBridgeType;
import aero.aixm.schema._5_1.PassengerServiceType;
import aero.aixm.schema._5_1.PilotControlledLightingType;
import aero.aixm.schema._5_1.PrecisionApproachRadarType;
import aero.aixm.schema._5_1.PrimarySurveillanceRadarType;
import aero.aixm.schema._5_1.ProcedureDMEType;
import aero.aixm.schema._5_1.RadarSystemType;
import aero.aixm.schema._5_1.RadioCommunicationChannelType;
import aero.aixm.schema._5_1.RadioFrequencyAreaType;
import aero.aixm.schema._5_1.RoadType;
import aero.aixm.schema._5_1.RouteDMEType;
import aero.aixm.schema._5_1.RouteSegmentType;
import aero.aixm.schema._5_1.RouteType;
import aero.aixm.schema._5_1.RulesProceduresType;
import aero.aixm.schema._5_1.RunwayBlastPadType;
import aero.aixm.schema._5_1.RunwayCentrelinePointType;
import aero.aixm.schema._5_1.RunwayDirectionLightSystemType;
import aero.aixm.schema._5_1.RunwayDirectionType;
import aero.aixm.schema._5_1.RunwayElementType;
import aero.aixm.schema._5_1.RunwayMarkingType;
import aero.aixm.schema._5_1.RunwayProtectAreaLightSystemType;
import aero.aixm.schema._5_1.RunwayProtectAreaType;
import aero.aixm.schema._5_1.RunwayType;
import aero.aixm.schema._5_1.RunwayVisualRangeType;
import aero.aixm.schema._5_1.SDFType;
import aero.aixm.schema._5_1.SafeAltitudeAreaType;
import aero.aixm.schema._5_1.SeaplaneLandingAreaType;
import aero.aixm.schema._5_1.SeaplaneRampSiteType;
import aero.aixm.schema._5_1.SearchRescueServiceType;
import aero.aixm.schema._5_1.SecondarySurveillanceRadarType;
import aero.aixm.schema._5_1.SignificantPointInAirspaceType;
import aero.aixm.schema._5_1.SpecialDateType;
import aero.aixm.schema._5_1.SpecialNavigationStationType;
import aero.aixm.schema._5_1.SpecialNavigationSystemType;
import aero.aixm.schema._5_1.StandMarkingType;
import aero.aixm.schema._5_1.StandardInstrumentArrivalType;
import aero.aixm.schema._5_1.StandardInstrumentDepartureType;
import aero.aixm.schema._5_1.StandardLevelColumnType;
import aero.aixm.schema._5_1.StandardLevelSectorType;
import aero.aixm.schema._5_1.StandardLevelTableType;
import aero.aixm.schema._5_1.SurveyControlPointType;
import aero.aixm.schema._5_1.TACANType;
import aero.aixm.schema._5_1.TaxiHoldingPositionLightSystemType;
import aero.aixm.schema._5_1.TaxiHoldingPositionMarkingType;
import aero.aixm.schema._5_1.TaxiHoldingPositionType;
import aero.aixm.schema._5_1.TaxiwayElementType;
import aero.aixm.schema._5_1.TaxiwayLightSystemType;
import aero.aixm.schema._5_1.TaxiwayMarkingType;
import aero.aixm.schema._5_1.TaxiwayType;
import aero.aixm.schema._5_1.TerminalArrivalAreaType;
import aero.aixm.schema._5_1.TouchDownLiftOffLightSystemType;
import aero.aixm.schema._5_1.TouchDownLiftOffMarkingType;
import aero.aixm.schema._5_1.TouchDownLiftOffSafeAreaType;
import aero.aixm.schema._5_1.TouchDownLiftOffType;
import aero.aixm.schema._5_1.UnitType;
import aero.aixm.schema._5_1.UnplannedHoldingType;
import aero.aixm.schema._5_1.VORType;
import aero.aixm.schema._5_1.VerticalStructureType;
import aero.aixm.schema._5_1.VisualGlideSlopeIndicatorType;
import aero.aixm.schema._5_1.WorkAreaType;
import net.opengis.om._2.OMObservationType;


/**
 * <p>Java class for FeatureArrayPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureArrayPropertyType", propOrder = {
    "abstractFeature"
})
public class FeatureArrayPropertyType {

    @XmlElementRef(name = "AbstractFeature", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends AbstractFeatureType>> abstractFeature;

    /**
     * Gets the value of the abstractFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FlightRestrictionType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshCloudObservedOrEstimatedType }{@code >}
     * {@link JAXBElement }{@code <}{@link EruptingVolcanoType }{@code >}
     * {@link JAXBElement }{@code <}{@link AeronauticalGroundLightType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractRadarEquipmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceWeatherRegionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SearchRescueServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelSectorType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TerminalArrivalAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshObservedOrEstimatedConditionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSegmentLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AzimuthType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrecisionApproachRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link NonMovementAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingAssessmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshAdvisoryType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationReportType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficControlServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcedureDMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioFrequencyAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepartureLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlidepathType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshForecastConditionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link VORType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalFeederLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevationType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneRampSiteType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETType }{@code >}
     * {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETPositionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelTableType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneAdvisoryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleIndicationType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingPatternType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshCloudForecastType }{@code >}
     * {@link JAXBElement }{@code <}{@link AIRMETEvolvingConditionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurveyControlPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link AIRMETType }{@code >}
     * {@link JAXBElement }{@code <}{@link METARType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkerBeaconType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportClearanceServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportCollocationType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteDMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractApproachLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link FinalLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayCentrelinePointType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link InitialLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneObservedConditionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioCommunicationChannelType }{@code >}
     * {@link JAXBElement }{@code <}{@link CirclingAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationAuthorityType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalStructureType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanoType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTrafficSeparationServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETType }{@code >}
     * {@link JAXBElement }{@code <}{@link TAFType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link OMObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link WindObservedOrEstimatedType }{@code >}
     * {@link JAXBElement }{@code <}{@link TACANType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link SafeAltitudeAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeoBorderType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractNavaidEquipmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineType }{@code >}
     * {@link JAXBElement }{@code <}{@link SPECIType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAirportGroundServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalizerType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractProcedureType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link FireFightingServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkingBuoyType }{@code >}
     * {@link JAXBElement }{@code <}{@link DesignatedPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrestingGearType }{@code >}
     * {@link JAXBElement }{@code <}{@link SDFType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETEvolvingConditionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAirportHeliportProtectionAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationStationType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETEvolvingConditionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftGroundServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PilotControlledLightingType }{@code >}
     * {@link JAXBElement }{@code <}{@link MissedApproachLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatingDockSiteType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETEvolvingConditionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialDateType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointVORType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelColumnType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETPositionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntermediateLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceIndicationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObstacleAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadarSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETEvolvingConditionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHotSpotType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftStandType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportSuppliesServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link RulesProceduresType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayVisualRangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayBlastPadType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link AltimeterSourceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnplannedHoldingType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavaidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReportType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApproachLightingSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionFinderType }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityForAirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractNavigationSystemCheckpointType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneForecastConditionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGroundLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointINSType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurveillanceRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceWeatherAdvisoryType }{@code >}
     * {@link JAXBElement }{@code <}{@link DMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link AIRMETEvolvingConditionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETPositionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link NDBType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceWeatherAnalysisType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeOverPointType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractFeatureType>> getAbstractFeature() {
        if (abstractFeature == null) {
            abstractFeature = new ArrayList<JAXBElement<? extends AbstractFeatureType>>();
        }
        return this.abstractFeature;
    }

    public boolean isSetAbstractFeature() {
        return ((this.abstractFeature!= null)&&(!this.abstractFeature.isEmpty()));
    }

    public void unsetAbstractFeature() {
        this.abstractFeature = null;
    }

}
