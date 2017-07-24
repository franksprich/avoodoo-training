
package com.avoodoo.example.sap.insobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isAliveResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isAliveResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsAliveResponse" type="{http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService}isAliveResponseWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isAliveResponse", propOrder = {
    "isAliveResponse"
})
public class IsAliveResponse {

    @XmlElement(name = "IsAliveResponse")
    protected IsAliveResponseWs isAliveResponse;

    /**
     * Gets the value of the isAliveResponse property.
     * 
     * @return
     *     possible object is
     *     {@link IsAliveResponseWs }
     *     
     */
    public IsAliveResponseWs getIsAliveResponse() {
        return isAliveResponse;
    }

    /**
     * Sets the value of the isAliveResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsAliveResponseWs }
     *     
     */
    public void setIsAliveResponse(IsAliveResponseWs value) {
        this.isAliveResponse = value;
    }

}
