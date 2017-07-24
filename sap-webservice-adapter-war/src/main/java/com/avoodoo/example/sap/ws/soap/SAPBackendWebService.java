package com.avoodoo.example.sap.ws.soap;
//
//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebResult;
//import javax.jws.WebService;
//import javax.jws.soap.SOAPBinding;
//import javax.xml.ws.BindingType;
//
//import com.avoodoo.example.sap.ws.soap.entity.EXKASSODETAILS;
//import com.avoodoo.example.sap.ws.soap.entity.EXKASSODETAILSResponse;
//import com.avoodoo.example.sap.ws.soap.entity.IsAliveResponseWs;
//import com.avoodoo.example.sap.ws.soap.error.RfcZEVINSOBJECTEXKASSODETAILSException;
//
//@WebService(name = "SAPBackendWs", serviceName = "SAPBackendWebService", portName = "SAPBackendWebServicePort", targetNamespace = "http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService")
//@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
//@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
//public class SAPBackendWebService {
//
//	@WebMethod(operationName = "EXKASSO_DETAILS", action = "http://sap.com/xi/WebService/soap1.1")
//	@WebResult(name = "Z_EV_INSOBJECT_EXKASSO_DETAILSResponse", partName = "parameters")
//	public EXKASSODETAILSResponse exkassoDETAILS(
//			@WebParam(name = "Z_EV_INSOBJECT_EXKASSO_DETAILS") EXKASSODETAILS parameters)
//			throws RfcZEVINSOBJECTEXKASSODETAILSException {
//		return new EXKASSODETAILSResponse("Honck");
//	}
//
//	@WebMethod(action = "isAlive")
//	@WebResult(name = "IsAliveResponse")
//	public IsAliveResponseWs isAlive() {
//		return new IsAliveResponseWs("Harald");
//	}
//
//}
