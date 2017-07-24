package com.avoodoo.example.server.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.avoodoo.example.server.rest.valuewrapper.BooleanValue;

import io.swagger.annotations.ApiOperation;

/**
 * Implements a isAlive.
 * 
 * @author frank
 *
 */
public abstract class AbstractResource {
	
	/**
	 * Checks the availability of the resource.
	 * 
	 * @return
	 */
	@GET
	@Path(Constants.IS_ALIVE)
	@ApiOperation(value = "Checks the availability of the resource.", nickname = "AreYouThere", response = BooleanValue.class)
	public Response isAlive() {
		return Response.ok(new BooleanValue(Boolean.TRUE)).build();
	}

}
