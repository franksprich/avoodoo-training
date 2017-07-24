package com.avoodoo.example.server.rest.provider.paramconverter;

import java.text.MessageFormat;
import java.time.LocalDateTime;

import javax.inject.Inject;
import javax.ws.rs.ext.ParamConverter;

import org.apache.log4j.Logger;

import com.avoodoo.example.server.rest.utils.DateFormatUtils;

/**
 * Converter for {@link #java.time.LocalDateTime}
 * @author frank
 *
 */
public class LocalDateTimeParamConverter implements ParamConverter<LocalDateTime> {

	@Inject
	private static Logger LOG;
	
	@Override
	public LocalDateTime fromString(String value) {
		LocalDateTime result = null;
		
		try{
			if (null == value || value.isEmpty()) {
				return null;
			}	
			result = LocalDateTime.parse(value, DateFormatUtils.DATETIME_FORMATTER);
		}
		catch(Exception e){
			LOG.error(MessageFormat.format("Error during converting {0} into {1}", value, LocalDateTime.class.getSimpleName()), e);
		}
		return result;
	}

	@Override
	public String toString(LocalDateTime value) {
		String result = null;
		
		try{
			if (null == value) {
				return null;
			}
			result = DateFormatUtils.DATETIME_FORMATTER.format(value);
		}
		catch(Exception e){
			LOG.error(MessageFormat.format("Error during converting {0} into {1}", value, String.class.getSimpleName()), e);
		}
		return result;
	}

}
