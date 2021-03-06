//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:41:52 PM MSK 
//


package schemabindings21._int.icao.iwxxm._2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

import schemabindings21._int.wmo.def.metce._2013.VolcanoPropertyType;


/**
 * <p>Java class for VolcanicAshSIGMETType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolcanicAshSIGMETType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://icao.int/iwxxm/2.1}SIGMETType">
 *       &lt;sequence>
 *         &lt;element name="eruptingVolcano" type="{http://def.wmo.int/metce/2013}VolcanoPropertyType"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolcanicAshSIGMETType", propOrder = {
    "rest"
})
public class VolcanicAshSIGMETType
    extends SIGMETType
{

    @XmlElementRefs({
        @XmlElementRef(name = "eruptingVolcano", namespace = "http://icao.int/iwxxm/2.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extension", namespace = "http://icao.int/iwxxm/2.1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Extension" is used by two different parts of a schema. See: 
     * line 298 of file:/home/moryakov/Development/workspace_gamc/iwxxmConverter/src/test/resources/iwxxm/2.1/sigmet.xsd
     * line 161 of file:/home/moryakov/Development/workspace_gamc/iwxxmConverter/src/test/resources/iwxxm/2.1/sigmet.xsd
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
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanoPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
