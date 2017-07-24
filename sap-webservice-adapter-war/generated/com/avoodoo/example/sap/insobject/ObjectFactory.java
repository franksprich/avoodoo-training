
package com.avoodoo.example.sap.insobject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.avoodoo.example.sap.insobject package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IsAliveResponse_QNAME = new QName("http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService", "isAliveResponse");
    private final static QName _ZEVINSOBJECTEXKASSODETAILSException_QNAME = new QName("http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService", "Z_EV_INSOBJECT_EXKASSO_DETAILSException");
    private final static QName _GetExkassoDETAILSResponse_QNAME = new QName("http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService", "getExkassoDETAILSResponse");
    private final static QName _GetExkassoDETAILS_QNAME = new QName("http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService", "getExkassoDETAILS");
    private final static QName _IsAlive_QNAME = new QName("http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService", "isAlive");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.avoodoo.example.sap.insobject
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsAlive }
     * 
     */
    public IsAlive createIsAlive() {
        return new IsAlive();
    }

    /**
     * Create an instance of {@link IsAliveResponse }
     * 
     */
    public IsAliveResponse createIsAliveResponse() {
        return new IsAliveResponse();
    }

    /**
     * Create an instance of {@link ZevinsobjectexkassodetailsException }
     * 
     */
    public ZevinsobjectexkassodetailsException createZevinsobjectexkassodetailsException() {
        return new ZevinsobjectexkassodetailsException();
    }

    /**
     * Create an instance of {@link GetExkassoDETAILSResponse }
     * 
     */
    public GetExkassoDETAILSResponse createGetExkassoDETAILSResponse() {
        return new GetExkassoDETAILSResponse();
    }

    /**
     * Create an instance of {@link GetExkassoDETAILS }
     * 
     */
    public GetExkassoDETAILS createGetExkassoDETAILS() {
        return new GetExkassoDETAILS();
    }

    /**
     * Create an instance of {@link ExkassodetailsResponse }
     * 
     */
    public ExkassodetailsResponse createExkassodetailsResponse() {
        return new ExkassodetailsResponse();
    }

    /**
     * Create an instance of {@link Exkassodetails }
     * 
     */
    public Exkassodetails createExkassodetails() {
        return new Exkassodetails();
    }

    /**
     * Create an instance of {@link IsAliveResponseWs }
     * 
     */
    public IsAliveResponseWs createIsAliveResponseWs() {
        return new IsAliveResponseWs();
    }

    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {
        return new Attributes();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAliveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService", name = "isAliveResponse")
    public JAXBElement<IsAliveResponse> createIsAliveResponse(IsAliveResponse value) {
        return new JAXBElement<IsAliveResponse>(_IsAliveResponse_QNAME, IsAliveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZevinsobjectexkassodetailsException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService", name = "Z_EV_INSOBJECT_EXKASSO_DETAILSException")
    public JAXBElement<ZevinsobjectexkassodetailsException> createZEVINSOBJECTEXKASSODETAILSException(ZevinsobjectexkassodetailsException value) {
        return new JAXBElement<ZevinsobjectexkassodetailsException>(_ZEVINSOBJECTEXKASSODETAILSException_QNAME, ZevinsobjectexkassodetailsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExkassoDETAILSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService", name = "getExkassoDETAILSResponse")
    public JAXBElement<GetExkassoDETAILSResponse> createGetExkassoDETAILSResponse(GetExkassoDETAILSResponse value) {
        return new JAXBElement<GetExkassoDETAILSResponse>(_GetExkassoDETAILSResponse_QNAME, GetExkassoDETAILSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExkassoDETAILS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService", name = "getExkassoDETAILS")
    public JAXBElement<GetExkassoDETAILS> createGetExkassoDETAILS(GetExkassoDETAILS value) {
        return new JAXBElement<GetExkassoDETAILS>(_GetExkassoDETAILS_QNAME, GetExkassoDETAILS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAlive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService", name = "isAlive")
    public JAXBElement<IsAlive> createIsAlive(IsAlive value) {
        return new JAXBElement<IsAlive>(_IsAlive_QNAME, IsAlive.class, null, value);
    }

}
