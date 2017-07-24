
package com.avoodoo.example.sap.insobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="V1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="V2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="V3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="V4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attributes", propOrder = {
    "v1",
    "v2",
    "v3",
    "v4"
})
public class Attributes {

    @XmlElement(name = "V1")
    protected String v1;
    @XmlElement(name = "V2")
    protected String v2;
    @XmlElement(name = "V3")
    protected String v3;
    @XmlElement(name = "V4")
    protected String v4;

    /**
     * Gets the value of the v1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV1() {
        return v1;
    }

    /**
     * Sets the value of the v1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV1(String value) {
        this.v1 = value;
    }

    /**
     * Gets the value of the v2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV2() {
        return v2;
    }

    /**
     * Sets the value of the v2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV2(String value) {
        this.v2 = value;
    }

    /**
     * Gets the value of the v3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV3() {
        return v3;
    }

    /**
     * Sets the value of the v3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV3(String value) {
        this.v3 = value;
    }

    /**
     * Gets the value of the v4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV4() {
        return v4;
    }

    /**
     * Sets the value of the v4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV4(String value) {
        this.v4 = value;
    }

}
