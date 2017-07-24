
package com.avoodoo.example.sap.insobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getExkassoDETAILS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getExkassoDETAILS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Z_EV_INSOBJECT_EXKASSO_DETAILS" type="{http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService}exkassodetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExkassoDETAILS", propOrder = {
    "zevinsobjectexkassodetails"
})
public class GetExkassoDETAILS {

    @XmlElement(name = "Z_EV_INSOBJECT_EXKASSO_DETAILS")
    protected Exkassodetails zevinsobjectexkassodetails;

    /**
     * Gets the value of the zevinsobjectexkassodetails property.
     * 
     * @return
     *     possible object is
     *     {@link Exkassodetails }
     *     
     */
    public Exkassodetails getZEVINSOBJECTEXKASSODETAILS() {
        return zevinsobjectexkassodetails;
    }

    /**
     * Sets the value of the zevinsobjectexkassodetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exkassodetails }
     *     
     */
    public void setZEVINSOBJECTEXKASSODETAILS(Exkassodetails value) {
        this.zevinsobjectexkassodetails = value;
    }

}
