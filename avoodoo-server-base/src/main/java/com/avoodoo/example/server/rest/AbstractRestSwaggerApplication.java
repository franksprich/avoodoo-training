package com.avoodoo.example.server.rest;

import java.util.LinkedHashSet;
import java.util.Set;

import com.avoodoo.example.server.config.ApplicationConfig;

import io.swagger.config.Scanner;
import io.swagger.config.SwaggerConfig;
import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.Info;
import io.swagger.models.Swagger;

public abstract class AbstractRestSwaggerApplication extends AbstractRestApplication {

	private String basePath;
	private Class<?>[] restResourceClasses;
	
	public AbstractRestSwaggerApplication(String anApplicationName, String env, String aBasePath, Class<?>... someRestResourceClasses) {
		this(anApplicationName, env, true, aBasePath, someRestResourceClasses);
	}
	
	public AbstractRestSwaggerApplication(String applicationName, String env, boolean isRegisterDefaultValidationHandling, String aBasePath, Class<?>... someRestResourceClasses) {
		super(applicationName, env, isRegisterDefaultValidationHandling);


		basePath = aBasePath.startsWith("/") ? aBasePath : "/" + aBasePath;
		restResourceClasses = someRestResourceClasses;
		
		/* Init Swagger */
		register(io.swagger.jaxrs.listing.ApiListingResource.class);
		register(io.swagger.jaxrs.listing.SwaggerSerializers.class);
		
		SwaggerContextService tempSwaggerContextService = new SwaggerContextService();
		tempSwaggerContextService.withSwaggerConfig(getSwaggerConfig());
		tempSwaggerContextService.withScanner(getScanner());
		tempSwaggerContextService.initConfig().initScanner();
		
	}
	
	private Scanner getScanner(){
		return new Scanner() {

			@Override
			public Set<Class<?>> classes() {
				Set<Class<?>> classes = new LinkedHashSet<>();
				for (Class<?> restResourcesClass : restResourceClasses) {
					classes.add(restResourcesClass);
				}
				return classes;
			}

			@Override
			public boolean getPrettyPrint() {
				return true;
			}

			@Override
			public void setPrettyPrint(boolean arg0) {
				// cannot be changed				
			}
			
		};
	}
	
	
	private SwaggerConfig getSwaggerConfig() {
		return new SwaggerConfig() {

			@Override
			public Swagger configure(Swagger aSwagger) {
				Info info = new Info();
				info.setTitle(ApplicationConfig.getApplicationId());
				info.setVersion(ApplicationConfig.getValue("serverbase.swkVersion", true));
				aSwagger.setInfo(info);
				aSwagger.setBasePath(basePath);
				return aSwagger;
			}

			@Override
			public String getFilterClass() {
				return null;
			}
			
		};
	}

}
