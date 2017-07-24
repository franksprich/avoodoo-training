package com.avoodoo.example.server.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import com.avoodoo.example.server.config.ApplicationConfig;
import com.avoodoo.example.server.rest.provider.ServerBaseParamConverterProvider;

public abstract class AbstractRestApplication extends ResourceConfig {

//	private static final String PROPERTY_OPENID_URL = "openid.config.url";
	
//	private static final String PROPERTY_TRINITY_URL = "trinity.config.url";
	
	public AbstractRestApplication(String applicationName, String env, boolean isRegisterDefaultValidationHandling) {
		setApplicationName(applicationName);
		packages("com.avoodoo");
		property(Constants.APPLICATION_NAME, applicationName);
		property(Constants.APPLICATION_ENV, env);
		property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, Boolean.TRUE.toString());
		property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, Boolean.TRUE.toString());
		
		if (isRegisterDefaultValidationHandling) {
//			register(ValidationExceptionMapper.class);
		}
		
		/* Register parameter converter */
		register(ServerBaseParamConverterProvider.class);
		
		/* Init security annotations (-> https://jersey.java.net/documentation/latest/security.html) */
		register(RolesAllowedDynamicFeature.class);
		
		
//		String tempIdentityServerUrl = getIdentityServerUrl();
//		if (null != tempIdentityServerUrl) {
//			property(Constants.PROPERTY_NAME_IDENTITY_SERVER_URL, tempIdentityServerUrl);
//		}
//		
//		String tempTrinityServerUrl = getTrintiyServerUrl();
//		if (null != tempTrinityServerUrl) {
//			property(PROPERTY_TRINITY_URL, tempTrinityServerUrl);
//		}
		
	}
	
//	public String getIdentityServerUrl() {
//		return ApplicationConfig.getValue(PROPERTY_OPENID_URL, true);
//	}
//	
//	public String getTrintiyServerUrl() {
//		return ApplicationConfig.getValue(PROPERTY_OPENID_URL, true);
//	}
	
	
	
}
