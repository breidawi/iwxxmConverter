//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package aero.aixm.schema._5_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondarySurveillanceRadarTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondarySurveillanceRadarTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}SecondarySurveillanceRadarPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSecondarySurveillanceRadarExtension"/>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSurveillanceRadarExtension"/>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRadarEquipmentExtension"/>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondarySurveillanceRadarTimeSliceType", propOrder = {
    "rest"
})
public class SecondarySurveillanceRadarTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRefs({
        @XmlElementRef(name = "verticalCoverageDistance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "antennaTiltFixed", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "autonomous", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "standbyPower", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "automatedRadarTerminalSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "digital", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transponder", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "range", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "serialNumber", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "militaryUseOnly", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contact", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "specialAircraftOnly", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dateMagneticVariation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "monopulse", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extension", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "movingTargetIndicator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "verticalCoverageAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "specialUseOnly", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tiltAngle", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "verticalCoverageAzimuth", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rangeAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dualChannel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "groundStation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "annotation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "magneticVariationAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "magneticVariation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Name" is used by two different parts of a schema. See: 
     * line 11154 of http://aixm.aero/schema/5.1.1/AIXM_Features.xsd
     * line 43 of http://schemas.opengis.net/gml/3.2.1/gmlBase.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeStandbyPowerType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeTransponderType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link ContactInformationPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarTimeSliceType.Extension }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurveillanceGroundStationPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link NotePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValMagneticVariationType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSecondarySurveillanceRadarExtension"/>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSurveillanceRadarExtension"/>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRadarEquipmentExtension"/>
     *       &lt;/choice>
     *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractSecondarySurveillanceRadarExtension",
        "abstractSurveillanceRadarExtension",
        "abstractRadarEquipmentExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractSecondarySurveillanceRadarExtension")
        protected AbstractExtensionType abstractSecondarySurveillanceRadarExtension;
        @XmlElement(name = "AbstractSurveillanceRadarExtension")
        protected AbstractExtensionType abstractSurveillanceRadarExtension;
        @XmlElement(name = "AbstractRadarEquipmentExtension")
        protected AbstractExtensionType abstractRadarEquipmentExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractSecondarySurveillanceRadarExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractSecondarySurveillanceRadarExtension() {
            return abstractSecondarySurveillanceRadarExtension;
        }

        /**
         * Sets the value of the abstractSecondarySurveillanceRadarExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractSecondarySurveillanceRadarExtension(AbstractExtensionType value) {
            this.abstractSecondarySurveillanceRadarExtension = value;
        }

        public boolean isSetAbstractSecondarySurveillanceRadarExtension() {
            return (this.abstractSecondarySurveillanceRadarExtension!= null);
        }

        /**
         * Gets the value of the abstractSurveillanceRadarExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractSurveillanceRadarExtension() {
            return abstractSurveillanceRadarExtension;
        }

        /**
         * Sets the value of the abstractSurveillanceRadarExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractSurveillanceRadarExtension(AbstractExtensionType value) {
            this.abstractSurveillanceRadarExtension = value;
        }

        public boolean isSetAbstractSurveillanceRadarExtension() {
            return (this.abstractSurveillanceRadarExtension!= null);
        }

        /**
         * Gets the value of the abstractRadarEquipmentExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractRadarEquipmentExtension() {
            return abstractRadarEquipmentExtension;
        }

        /**
         * Sets the value of the abstractRadarEquipmentExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractRadarEquipmentExtension(AbstractExtensionType value) {
            this.abstractRadarEquipmentExtension = value;
        }

        public boolean isSetAbstractRadarEquipmentExtension() {
            return (this.abstractRadarEquipmentExtension!= null);
        }

        /**
         * Gets the value of the owns property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
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
         *     {@link Boolean }
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

}