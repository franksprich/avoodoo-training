
package com.avoodoo.example.sap.insobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exkassodetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exkassodetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exkassodetailsResponse", propOrder = {
    "responeName"
})
public class ExkassodetailsResponse {

    protected String responeName;

    /**
     * Gets the value of the responeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponeName() {
        return responeName;
    }

    /**
     * Sets the value of the responeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponeName(String value) {
        this.responeName = value;
    }

}
