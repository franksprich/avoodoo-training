package com.avoodoo.example.server.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.log4j.Logger;

import com.avoodoo.example.server.config.ApplicationConfig;

@Path("test")
public class TestResource {
	
	@Inject
	private Logger LOG;
	
	@GET
	public String show() {
		LOG.info(ApplicationConfig.getValue("serverbase.env"));
		LOG.info(ApplicationConfig.print());
		return " maven rocks! ...or not? - ohh god! yoyo";
	}
	
	public static void main(String[] args) {
		System.out.println(ApplicationConfig.getValue("serverbase.env"));
		System.out.println(ApplicationConfig.print());
	}

}
