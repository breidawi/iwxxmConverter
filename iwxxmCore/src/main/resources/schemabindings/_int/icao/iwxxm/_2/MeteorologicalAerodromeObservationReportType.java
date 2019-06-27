//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.18 at 02:04:43 PM MSK 
//


package _int.icao.iwxxm._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.om._2.OMObservationPropertyType;


/**
 * <p>Java class for MeteorologicalAerodromeObservationReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeteorologicalAerodromeObservationReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://icao.int/iwxxm/2.0}ReportType">
 *       &lt;sequence>
 *         &lt;element name="observation" type="{http://www.opengis.net/om/2.0}OM_ObservationPropertyType"/>
 *         &lt;element name="trendForecast" type="{http://www.opengis.net/om/2.0}OM_ObservationPropertyType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" use="required" type="{http://icao.int/iwxxm/2.0}MeteorologicalAerodromeReportStatusType" />
 *       &lt;attribute name="automatedStation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologicalAerodromeObservationReportType", propOrder = {
    "rest"
})
@XmlSeeAlso({
    SPECIType.class,
    METARType.class
})
public abstract class MeteorologicalAerodromeObservationReportType
    extends ReportType
{

    @XmlElementRefs({
        @XmlElementRef(name = "trendForecast", namespace = "http://icao.int/iwxxm/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extension", namespace = "http://icao.int/iwxxm/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "observation", namespace = "http://icao.int/iwxxm/2.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;
    @XmlAttribute(name = "status", required = true)
    protected MeteorologicalAerodromeReportStatusType status;
    @XmlAttribute(name = "automatedStation")
    protected Boolean automatedStation;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Extension" is used by two different parts of a schema. See: 
     * line 37 of file:/home/moryakov/Development/workspace/tafconverter/src/test/resources/iwxxm/2.0/metarSpeci.xsd
     * line 20 of file:/home/moryakov/Development/workspace/tafconverter/src/test/resources/iwxxm/2.0/common.xsd
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
     * {@link JAXBElement }{@code <}{@link OMObservationPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link OMObservationPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MeteorologicalAerodromeReportStatusType }
     *     
     */
    public MeteorologicalAerodromeReportStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteorologicalAerodromeReportStatusType }
     *     
     */
    public void setStatus(MeteorologicalAerodromeReportStatusType value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the automatedStation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutomatedStation() {
        return automatedStation;
    }

    /**
     * Sets the value of the automatedStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomatedStation(boolean value) {
        this.automatedStation = value;
    }

    public boolean isSetAutomatedStation() {
        return (this.automatedStation!= null);
    }

    public void unsetAutomatedStation() {
        this.automatedStation = null;
    }

}