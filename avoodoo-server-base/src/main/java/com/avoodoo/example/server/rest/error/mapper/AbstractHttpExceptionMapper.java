package com.avoodoo.example.server.rest.error.mapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.avoodoo.example.server.rest.error.AbstractError;

/**
 * @author frank
 *
 */
public abstract class AbstractHttpExceptionMapper {
	
	
	/**
	 * Converts the error in an HTTP 500 response with exception.
	 * 
	 * @param anError
	 * @return
	 */
	public Response toResponse(AbstractError anError) {
		return toResponse(anError, Status.INTERNAL_SERVER_ERROR);
	}
	
	/**
	 * Convert the error with the exception.
	 * 
	 * @param anError
	 * @param aStatus
	 * @return
	 */
	public Response toResponse(AbstractError anError, Status aStatus) {
		return Response.status(aStatus).entity(anError).type(MediaType.APPLICATION_JSON).build();
	}

}
