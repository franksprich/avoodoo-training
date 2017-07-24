package com.avoodoo.example.sap.ws.soap.error;

import javax.xml.ws.WebFault;

@SuppressWarnings("serial")
@WebFault(name = "Z_EV_INSOBJECT_EXKASSO_DETAILSException", targetNamespace = "http://www.avoodoo.com/sap-webservice-war/SAPBackendWebService")
public class RfcZEVINSOBJECTEXKASSODETAILSException extends Exception {

	private ZEVINSOBJECTEXKASSODETAILSException faultInfo;
	
	public RfcZEVINSOBJECTEXKASSODETAILSException(String message, ZEVINSOBJECTEXKASSODETAILSException faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}
	
	public RfcZEVINSOBJECTEXKASSODETAILSException(String message, ZEVINSOBJECTEXKASSODETAILSException faultInfo, Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}
	
	public ZEVINSOBJECTEXKASSODETAILSException getFaultInfo() {
		return faultInfo;
	}
	
}
