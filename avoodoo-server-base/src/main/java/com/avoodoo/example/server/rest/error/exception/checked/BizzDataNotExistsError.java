package com.avoodoo.example.server.rest.error.exception.checked;

import com.avoodoo.example.server.rest.error.AbstractError;

@SuppressWarnings("serial")
public class BizzDataNotExistsError extends AbstractError {
	
	private static final int MESSAGE_TYPE = 898;
	
	public BizzDataNotExistsError() {
		setMessageType(MESSAGE_TYPE);
	}

}
