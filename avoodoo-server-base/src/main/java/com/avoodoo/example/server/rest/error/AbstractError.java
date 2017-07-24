package com.avoodoo.example.server.rest.error;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@XmlRootElement
@XmlSeeAlso(ValidationError.class)
public abstract class AbstractError implements Serializable {
	
	private String invocationId;
	private int messageType;

}
