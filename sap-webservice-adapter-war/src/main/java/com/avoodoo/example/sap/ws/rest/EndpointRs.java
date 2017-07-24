package com.avoodoo.example.sap.ws.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.avoodoo.example.server.rest.AbstractResource;
import com.avoodoo.example.server.rest.mapper.MediaType;

//@Api(authorizations = {@Authorization(value = "basicAuth")})
@Path("/sap")
@Consumes(MediaType.APPLICATION_JSON_UTF_8)
@Produces(MediaType.APPLICATION_JSON_UTF_8)
public class EndpointRs extends AbstractResource {
	
	@GET
	@Path("getIt")
	public Response getIt(){
		return Response.ok().build();
	}

}

