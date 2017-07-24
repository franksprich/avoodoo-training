package com.avoodoo.example.sap.ws.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
//@SwaggerDefinition(securityDefinition = @SecurityDefinition(basicAuthDefinitions = {@BasicAuthDefinition(key = "basicAuth")}))
//public class ConfigurationRs extends AbstractRestSwaggerApplication {
public class ConfigurationRs extends Application {

//	public ConfigurationRs() {
//		super(
//				ApplicationConfig.getApplicationId(), 
//				ApplicationConfig.getEnvironment(), 
//				"sap-api", 
//				EndpointRs.class);
//		
//		register(MultiPartFeature.class);
//		register(BizzDataNotExistsErrorMapper.class);
//		
//		
//	}

}
