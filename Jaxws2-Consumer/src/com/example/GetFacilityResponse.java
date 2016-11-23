
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFacilityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFacilityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="myFacility" type="{http://example.com/}facility" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFacilityResponse", propOrder = {
    "myFacility"
})
public class GetFacilityResponse {

    protected Facility myFacility;

    /**
     * Gets the value of the myFacility property.
     * 
     * @return
     *     possible object is
     *     {@link Facility }
     *     
     */
    public Facility getMyFacility() {
        return myFacility;
    }

    /**
     * Sets the value of the myFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Facility }
     *     
     */
    public void setMyFacility(Facility value) {
        this.myFacility = value;
    }

}
