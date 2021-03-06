//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:33:13 PM MSK 
//


package _int.icao.iwxxm._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.LengthType;
import net.opengis.gml.v_3_2_1.MeasureType;


/**
 * <p>Java class for AerodromeSeaStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeSeaStateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seaSurfaceTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="significantWaveHeight" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="seaState" type="{http://icao.int/iwxxm/2.1}SeaSurfaceStateType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeSeaStateType", propOrder = {
    "seaSurfaceTemperature",
    "significantWaveHeight",
    "seaState",
    "extension"
})
public class AerodromeSeaStateType {

    @XmlElement(required = true)
    protected MeasureType seaSurfaceTemperature;
    protected LengthType significantWaveHeight;
    protected SeaSurfaceStateType seaState;
    protected List<Object> extension;

    /**
     * Gets the value of the seaSurfaceTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSeaSurfaceTemperature() {
        return seaSurfaceTemperature;
    }

    /**
     * Sets the value of the seaSurfaceTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSeaSurfaceTemperature(MeasureType value) {
        this.seaSurfaceTemperature = value;
    }

    public boolean isSetSeaSurfaceTemperature() {
        return (this.seaSurfaceTemperature!= null);
    }

    /**
     * Gets the value of the significantWaveHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getSignificantWaveHeight() {
        return significantWaveHeight;
    }

    /**
     * Sets the value of the significantWaveHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setSignificantWaveHeight(LengthType value) {
        this.significantWaveHeight = value;
    }

    public boolean isSetSignificantWaveHeight() {
        return (this.significantWaveHeight!= null);
    }

    /**
     * Gets the value of the seaState property.
     * 
     * @return
     *     possible object is
     *     {@link SeaSurfaceStateType }
     *     
     */
    public SeaSurfaceStateType getSeaState() {
        return seaState;
    }

    /**
     * Sets the value of the seaState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeaSurfaceStateType }
     *     
     */
    public void setSeaState(SeaSurfaceStateType value) {
        this.seaState = value;
    }

    public boolean isSetSeaState() {
        return (this.seaState!= null);
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Object>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

}
