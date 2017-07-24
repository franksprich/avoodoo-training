package com.avoodoo.example.server.rest.provider.paramconverter;

import java.text.MessageFormat;

import javax.inject.Inject;
import javax.ws.rs.ext.ParamConverter;

import org.apache.log4j.Logger;
import org.joda.time.LocalDate;

import com.avoodoo.example.server.rest.utils.DateFormatUtils;

/**
 * Converter for {@link #org.joda.time.LocalDate}
 * @author frank
 *
 */
public class JodaLocalDateTimeParamConverter implements ParamConverter<LocalDate> {

	@Inject
	private static Logger LOG;
	
	@Override
	public LocalDate fromString(String value) {
		LocalDate result = null;
		
		try{
			if (null == value || value.isEmpty()) {
				return null;
			}	
			result = DateFormatUtils.JODA_DATE_FORMATTER.parseLocalDate(value);
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
			result = DateFormatUtils.JODA_DATE_FORMATTER.print(value);
		}
		catch(Exception e){
			LOG.error(MessageFormat.format("Error during converting {0} into {1}", value, String.class.getSimpleName()), e);
		}
		return result;
	}

}
