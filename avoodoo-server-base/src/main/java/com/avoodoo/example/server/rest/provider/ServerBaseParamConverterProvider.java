package com.avoodoo.example.server.rest.provider;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;

import com.avoodoo.example.server.rest.provider.paramconverter.LocalDateTimeParamConverter;

public class ServerBaseParamConverterProvider implements ParamConverterProvider {

	/**
	 * Provider to convert the JSON parameter to Java objects and vice versa
	 * @author frank
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		if(rawType == LocalDateTime.class) {
			return (ParamConverter<T>) new LocalDateTimeParamConverter();
		}
		else if (rawType == LocalDate.class) {
			return (ParamConverter<T>) new LocalDateTimeParamConverter();
		}
		else if (rawType == org.joda.time.LocalDateTime.class) {
			return (ParamConverter<T>) new LocalDateTimeParamConverter();
		}
		else if (rawType == org.joda.time.LocalDate.class) {
			return (ParamConverter<T>) new LocalDateTimeParamConverter();
		}
		return null;
	}
	
	

}
