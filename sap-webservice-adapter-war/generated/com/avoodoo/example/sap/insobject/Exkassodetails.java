
package com.avoodoo.example.sap.insobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exkassodetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exkassodetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resquestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exkassodetails", propOrder = {
    "resquestName"
})
public class Exkassodetails {

    protected String resquestName;

    /**
     * Gets the value of the resquestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResquestName() {
        return resquestName;
    }

    /**
     * Sets the value of the resquestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResquestName(String value) {
        this.resquestName = value;
    }

}
