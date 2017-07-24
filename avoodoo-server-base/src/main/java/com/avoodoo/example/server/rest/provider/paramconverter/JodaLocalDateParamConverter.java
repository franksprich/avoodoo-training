package com.avoodoo.example.server.rest.provider.paramconverter;

import java.text.MessageFormat;

import javax.inject.Inject;
import javax.ws.rs.ext.ParamConverter;

import org.apache.log4j.Logger;
import org.joda.time.LocalDateTime;

import com.avoodoo.example.server.rest.utils.DateFormatUtils;

/**
 * Converter for {@link #org.joda.time.LocalDateTime}
 * @author frank
 *
 */
public class JodaLocalDateParamConverter implements ParamConverter<LocalDateTime> {

	@Inject
	private static Logger LOG;
	
	@Override
	public LocalDateTime fromString(String value) {
		LocalDateTime result = null;
		
		try{
			if (null == value || value.isEmpty()) {
				return null;
			}	
			result = DateFormatUtils.JODA_DATETIME_FORMATTER.parseLocalDateTime(value);
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
			result = DateFormatUtils.JODA_DATETIME_FORMATTER.print(value);
		}
		catch(Exception e){
			LOG.error(MessageFormat.format("Error during converting {0} into {1}", value, String.class.getSimpleName()), e);
		}
		return result;
	}

}
