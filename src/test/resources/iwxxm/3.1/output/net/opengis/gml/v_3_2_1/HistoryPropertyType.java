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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.schema._5_1.AerialRefuellingTimeSliceType;
import aero.aixm.schema._5_1.AeronauticalGroundLightTimeSliceType;
import aero.aixm.schema._5_1.AirTrafficControlServiceTimeSliceType;
import aero.aixm.schema._5_1.AirTrafficManagementServiceTimeSliceType;
import aero.aixm.schema._5_1.AircraftGroundServiceTimeSliceType;
import aero.aixm.schema._5_1.AircraftStandTimeSliceType;
import aero.aixm.schema._5_1.AirportClearanceServiceTimeSliceType;
import aero.aixm.schema._5_1.AirportHeliportCollocationTimeSliceType;
import aero.aixm.schema._5_1.AirportHeliportTimeSliceType;
import aero.aixm.schema._5_1.AirportHotSpotTimeSliceType;
import aero.aixm.schema._5_1.AirportProtectionAreaMarkingTimeSliceType;
import aero.aixm.schema._5_1.AirportSuppliesServiceTimeSliceType;
import aero.aixm.schema._5_1.AirspaceBorderCrossingTimeSliceType;
import aero.aixm.schema._5_1.AirspaceTimeSliceType;
import aero.aixm.schema._5_1.AltimeterSourceTimeSliceType;
import aero.aixm.schema._5_1.AngleIndicationTimeSliceType;
import aero.aixm.schema._5_1.ApproachLightingSystemTimeSliceType;
import aero.aixm.schema._5_1.ApronElementTimeSliceType;
import aero.aixm.schema._5_1.ApronLightSystemTimeSliceType;
import aero.aixm.schema._5_1.ApronMarkingTimeSliceType;
import aero.aixm.schema._5_1.ApronTimeSliceType;
import aero.aixm.schema._5_1.ArrestingGearTimeSliceType;
import aero.aixm.schema._5_1.ArrivalFeederLegTimeSliceType;
import aero.aixm.schema._5_1.ArrivalLegTimeSliceType;
import aero.aixm.schema._5_1.AuthorityForAirspaceTimeSliceType;
import aero.aixm.schema._5_1.AzimuthTimeSliceType;
import aero.aixm.schema._5_1.ChangeOverPointTimeSliceType;
import aero.aixm.schema._5_1.CheckpointINSTimeSliceType;
import aero.aixm.schema._5_1.CheckpointVORTimeSliceType;
import aero.aixm.schema._5_1.CirclingAreaTimeSliceType;
import aero.aixm.schema._5_1.DMETimeSliceType;
import aero.aixm.schema._5_1.DeicingAreaMarkingTimeSliceType;
import aero.aixm.schema._5_1.DeicingAreaTimeSliceType;
import aero.aixm.schema._5_1.DepartureLegTimeSliceType;
import aero.aixm.schema._5_1.DesignatedPointTimeSliceType;
import aero.aixm.schema._5_1.DirectionFinderTimeSliceType;
import aero.aixm.schema._5_1.DistanceIndicationTimeSliceType;
import aero.aixm.schema._5_1.ElevationTimeSliceType;
import aero.aixm.schema._5_1.FinalLegTimeSliceType;
import aero.aixm.schema._5_1.FireFightingServiceTimeSliceType;
import aero.aixm.schema._5_1.FlightRestrictionTimeSliceType;
import aero.aixm.schema._5_1.FloatingDockSiteTimeSliceType;
import aero.aixm.schema._5_1.GeoBorderTimeSliceType;
import aero.aixm.schema._5_1.GlidepathTimeSliceType;
import aero.aixm.schema._5_1.GroundTrafficControlServiceTimeSliceType;
import aero.aixm.schema._5_1.GuidanceLineLightSystemTimeSliceType;
import aero.aixm.schema._5_1.GuidanceLineMarkingTimeSliceType;
import aero.aixm.schema._5_1.GuidanceLineTimeSliceType;
import aero.aixm.schema._5_1.HoldingAssessmentTimeSliceType;
import aero.aixm.schema._5_1.HoldingPatternTimeSliceType;
import aero.aixm.schema._5_1.InformationServiceTimeSliceType;
import aero.aixm.schema._5_1.InitialLegTimeSliceType;
import aero.aixm.schema._5_1.InstrumentApproachProcedureTimeSliceType;
import aero.aixm.schema._5_1.IntermediateLegTimeSliceType;
import aero.aixm.schema._5_1.LocalizerTimeSliceType;
import aero.aixm.schema._5_1.MarkerBeaconTimeSliceType;
import aero.aixm.schema._5_1.MarkingBuoyTimeSliceType;
import aero.aixm.schema._5_1.MissedApproachLegTimeSliceType;
import aero.aixm.schema._5_1.NDBTimeSliceType;
import aero.aixm.schema._5_1.NavaidTimeSliceType;
import aero.aixm.schema._5_1.NavigationAreaRestrictionTimeSliceType;
import aero.aixm.schema._5_1.NavigationAreaTimeSliceType;
import aero.aixm.schema._5_1.NonMovementAreaTimeSliceType;
import aero.aixm.schema._5_1.ObstacleAreaTimeSliceType;
import aero.aixm.schema._5_1.OrganisationAuthorityTimeSliceType;
import aero.aixm.schema._5_1.PassengerLoadingBridgeTimeSliceType;
import aero.aixm.schema._5_1.PassengerServiceTimeSliceType;
import aero.aixm.schema._5_1.PilotControlledLightingTimeSliceType;
import aero.aixm.schema._5_1.PrecisionApproachRadarTimeSliceType;
import aero.aixm.schema._5_1.PrimarySurveillanceRadarTimeSliceType;
import aero.aixm.schema._5_1.ProcedureDMETimeSliceType;
import aero.aixm.schema._5_1.RadarSystemTimeSliceType;
import aero.aixm.schema._5_1.RadioCommunicationChannelTimeSliceType;
import aero.aixm.schema._5_1.RadioFrequencyAreaTimeSliceType;
import aero.aixm.schema._5_1.RoadTimeSliceType;
import aero.aixm.schema._5_1.RouteDMETimeSliceType;
import aero.aixm.schema._5_1.RouteSegmentTimeSliceType;
import aero.aixm.schema._5_1.RouteTimeSliceType;
import aero.aixm.schema._5_1.RulesProceduresTimeSliceType;
import aero.aixm.schema._5_1.RunwayBlastPadTimeSliceType;
import aero.aixm.schema._5_1.RunwayCentrelinePointTimeSliceType;
import aero.aixm.schema._5_1.RunwayDirectionLightSystemTimeSliceType;
import aero.aixm.schema._5_1.RunwayDirectionTimeSliceType;
import aero.aixm.schema._5_1.RunwayElementTimeSliceType;
import aero.aixm.schema._5_1.RunwayMarkingTimeSliceType;
import aero.aixm.schema._5_1.RunwayProtectAreaLightSystemTimeSliceType;
import aero.aixm.schema._5_1.RunwayProtectAreaTimeSliceType;
import aero.aixm.schema._5_1.RunwayTimeSliceType;
import aero.aixm.schema._5_1.RunwayVisualRangeTimeSliceType;
import aero.aixm.schema._5_1.SDFTimeSliceType;
import aero.aixm.schema._5_1.SafeAltitudeAreaTimeSliceType;
import aero.aixm.schema._5_1.SeaplaneLandingAreaTimeSliceType;
import aero.aixm.schema._5_1.SeaplaneRampSiteTimeSliceType;
import aero.aixm.schema._5_1.SearchRescueServiceTimeSliceType;
import aero.aixm.schema._5_1.SecondarySurveillanceRadarTimeSliceType;
import aero.aixm.schema._5_1.SignificantPointInAirspaceTimeSliceType;
import aero.aixm.schema._5_1.SpecialDateTimeSliceType;
import aero.aixm.schema._5_1.SpecialNavigationStationTimeSliceType;
import aero.aixm.schema._5_1.SpecialNavigationSystemTimeSliceType;
import aero.aixm.schema._5_1.StandMarkingTimeSliceType;
import aero.aixm.schema._5_1.StandardInstrumentArrivalTimeSliceType;
import aero.aixm.schema._5_1.StandardInstrumentDepartureTimeSliceType;
import aero.aixm.schema._5_1.StandardLevelColumnTimeSliceType;
import aero.aixm.schema._5_1.StandardLevelSectorTimeSliceType;
import aero.aixm.schema._5_1.StandardLevelTableTimeSliceType;
import aero.aixm.schema._5_1.SurveyControlPointTimeSliceType;
import aero.aixm.schema._5_1.TACANTimeSliceType;
import aero.aixm.schema._5_1.TaxiHoldingPositionLightSystemTimeSliceType;
import aero.aixm.schema._5_1.TaxiHoldingPositionMarkingTimeSliceType;
import aero.aixm.schema._5_1.TaxiHoldingPositionTimeSliceType;
import aero.aixm.schema._5_1.TaxiwayElementTimeSliceType;
import aero.aixm.schema._5_1.TaxiwayLightSystemTimeSliceType;
import aero.aixm.schema._5_1.TaxiwayMarkingTimeSliceType;
import aero.aixm.schema._5_1.TaxiwayTimeSliceType;
import aero.aixm.schema._5_1.TerminalArrivalAreaTimeSliceType;
import aero.aixm.schema._5_1.TouchDownLiftOffLightSystemTimeSliceType;
import aero.aixm.schema._5_1.TouchDownLiftOffMarkingTimeSliceType;
import aero.aixm.schema._5_1.TouchDownLiftOffSafeAreaTimeSliceType;
import aero.aixm.schema._5_1.TouchDownLiftOffTimeSliceType;
import aero.aixm.schema._5_1.UnitTimeSliceType;
import aero.aixm.schema._5_1.UnplannedHoldingTimeSliceType;
import aero.aixm.schema._5_1.VORTimeSliceType;
import aero.aixm.schema._5_1.VerticalStructureTimeSliceType;
import aero.aixm.schema._5_1.VisualGlideSlopeIndicatorTimeSliceType;
import aero.aixm.schema._5_1.WorkAreaTimeSliceType;


/**
 * <p>Java class for HistoryPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoryPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractTimeSlice" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryPropertyType", propOrder = {
    "abstractTimeSlice"
})
public class HistoryPropertyType {

    @XmlElementRef(name = "AbstractTimeSlice", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractTimeSliceType>> abstractTimeSlice;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Gets the value of the abstractTimeSlice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractTimeSlice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractTimeSlice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RunwayBlastPadTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TACANTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavaidTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadarSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SDFTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RulesProceduresTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeoBorderTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrestingGearTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcedureDMETimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationStationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntermediateLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointINSTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApproachLightingSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NonMovementAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayCentrelinePointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MissedApproachLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatingDockSiteTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftStandTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportClearanceServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AeronauticalGroundLightTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionFinderTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayElementTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AzimuthTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlightRestrictionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficControlServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SearchRescueServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteSegmentTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NDBTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DesignatedPointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnplannedHoldingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalStructureTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportSuppliesServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InitialLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteDMETimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingPatternTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepartureLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link VORTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkerBeaconTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceIndicationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkingBuoyTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObstacleAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftGroundServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityForAirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CirclingAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelColumnTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayElementTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SafeAltitudeAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalFeederLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlidepathTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AltimeterSourceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneRampSiteTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioFrequencyAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronElementTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportCollocationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TerminalArrivalAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DMETimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelSectorTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialDateTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingAssessmentTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FireFightingServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayVisualRangeTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelTableTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MovingObjectStatusType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHotSpotTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationAuthorityTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeOverPointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointVORTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalizerTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FinalLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleIndicationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PilotControlledLightingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrecisionApproachRadarTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioCommunicationChannelTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurveyControlPointTimeSliceType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractTimeSliceType>> getAbstractTimeSlice() {
        if (abstractTimeSlice == null) {
            abstractTimeSlice = new ArrayList<JAXBElement<? extends AbstractTimeSliceType>>();
        }
        return this.abstractTimeSlice;
    }

    public boolean isSetAbstractTimeSlice() {
        return ((this.abstractTimeSlice!= null)&&(!this.abstractTimeSlice.isEmpty()));
    }

    public void unsetAbstractTimeSlice() {
        this.abstractTimeSlice = null;
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

}