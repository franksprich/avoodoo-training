package com.avoodoo.example.server.rest.error.mapper.checked;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import com.avoodoo.example.server.rest.error.exception.checked.BizzDataNotExistsError;
import com.avoodoo.example.server.rest.error.mapper.AbstractHttpExceptionMapper;

public class BizzDataNotExistsErrorMapper extends AbstractHttpExceptionMapper implements ExceptionMapper<Exception> {

	@Override
	public Response toResponse(Exception exception) {
		BizzDataNotExistsError error = new BizzDataNotExistsError();
		return toResponse(error);
	}

}
