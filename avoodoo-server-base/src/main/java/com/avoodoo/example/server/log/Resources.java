package com.avoodoo.example.server.log;

import org.apache.log4j.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class Resources {

	
	@Produces
	public Logger produceLog(InjectionPoint ip){
		return Logger.getLogger(ip.getMember().getDeclaringClass().getName());
	}
	
}
