package com.avoodoo.example.server.rest.provider.paramconverter;

import java.text.MessageFormat;
import java.time.LocalDate;

import javax.inject.Inject;
import javax.ws.rs.ext.ParamConverter;

import org.apache.log4j.Logger;

import com.avoodoo.example.server.rest.utils.DateFormatUtils;

/**
 * Converter for {@link #java.time.LocalDate}
 * @author frank
 *
 */
public class LocalDateParamConverter implements ParamConverter<LocalDate> {

	@Inject
	private static Logger LOG;
	
	@Override
	public LocalDate fromString(String value) {
		LocalDate result = null;
		
		try{
			if (null == value || value.isEmpty()) {
				return null;
			}	
			result = LocalDate.parse(value, DateFormatUtils.DATE_FORMATTER);
		}
		catch(Exception e){
			LOG.error(MessageFormat.format("Error during converting {0} into {1}", value, LocalDate.class.getSimpleName()), e);
		}
		return result;
	}

	@Override
	public String toString(LocalDate value) {
		String result = null;
		
		try{
			if (null == value) {
				return null;
			}
			result = DateFormatUtils.DATE_FORMATTER.format(value);
		}
		catch(Exception e){
			LOG.error(MessageFormat.format("Error during converting {0} into {1}", value, String.class.getSimpleName()), e);
		}
		return result;
	}

}
