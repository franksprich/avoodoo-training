
package com.avoodoo.example.sap.insobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getExkassoDETAILSResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getExkassoDETAILSResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Z_EV_INSOBJECT_EXKASSO_DETAILSResponse" type="{http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService}exkassodetailsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExkassoDETAILSResponse", propOrder = {
    "zevinsobjectexkassodetailsResponse"
})
public class GetExkassoDETAILSResponse {

    @XmlElement(name = "Z_EV_INSOBJECT_EXKASSO_DETAILSResponse")
    protected ExkassodetailsResponse zevinsobjectexkassodetailsResponse;

    /**
     * Gets the value of the zevinsobjectexkassodetailsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ExkassodetailsResponse }
     *     
     */
    public ExkassodetailsResponse getZEVINSOBJECTEXKASSODETAILSResponse() {
        return zevinsobjectexkassodetailsResponse;
    }

    /**
     * Sets the value of the zevinsobjectexkassodetailsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExkassodetailsResponse }
     *     
     */
    public void setZEVINSOBJECTEXKASSODETAILSResponse(ExkassodetailsResponse value) {
        this.zevinsobjectexkassodetailsResponse = value;
    }

}
