package com.avoodoo.example.sap.ws.soap.error;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Z_EV_INSOBJECT_EXKASSO_DETAILSException")
public class ZEVINSOBJECTEXKASSODETAILSException {
	
	@XmlElement(name = "Name", required = true)
	protected String name;
	@XmlElement(name = "Text")
	protected String text;
	@XmlElement(name = "Message")
	protected ZEVINSOBJECTEXKASSODETAILSException.Message message;
	@XmlElement(name = "Attributes")
	protected ZEVINSOBJECTEXKASSODETAILSException.Attributes attributes;
	

	@Data
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class Message {
		@XmlElement(name = "ID")
		protected String id;
		@XmlElement(name = "Number")
		protected String number;
	}
	
	@Data
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class Attributes {
		@XmlElement(name = "V1")
		protected String v1;
		@XmlElement(name = "V2")
		protected String v2;
		@XmlElement(name = "V3")
		protected String v3;
		@XmlElement(name = "V4")
		protected String v4;
	}
}
