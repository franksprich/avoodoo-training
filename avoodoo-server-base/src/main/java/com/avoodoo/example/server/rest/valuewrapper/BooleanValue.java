package com.avoodoo.example.server.rest.valuewrapper;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * POJO class value wrapper for the {@link Boolean} type.
 * 
 * @author frank
 *
 */
public class BooleanValue {
	
	@XmlAttribute(name = "boolean")
	private Boolean value;

	/**
	 * Creates a new instance of this class.
	 */
	public BooleanValue() {
		super();
	}
	
	/**
	 * Creates a new instance of this class.
	 * 
	 * @param aValue
	 */
	public BooleanValue(Boolean aValue) {
		super();
		value = aValue;
	}
	
	public Boolean getValue() {
		return value;
	}

	public void setValue(Boolean value) {
		this.value = value;
	}
	
	

}
