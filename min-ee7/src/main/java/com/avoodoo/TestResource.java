package com.avoodoo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("test")
public class TestResource {
	
	@GET
	public String show() {
		return " maven rocks! ...or not? - ohh god! yoyo";
	}

}
