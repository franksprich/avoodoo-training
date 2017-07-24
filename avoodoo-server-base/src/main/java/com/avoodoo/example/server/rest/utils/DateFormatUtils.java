package com.avoodoo.example.server.rest.utils;

import java.time.format.DateTimeFormatter;

public class DateFormatUtils {
	
	/**
	 * DATE_FORMAT
	 */
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	
	/**
	 * DATETIME_FORMAT
	 */
	public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss:SSS";
	
	/**
	 * DATE_FORMATTER
	 */
	public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
	
	/**
	 * DATETIME_FORMATTER
	 */
	public static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern(DATETIME_FORMAT);
	
	/**
	 * JODA_DATE_FORMATTER
	 */
	public static final org.joda.time.format.DateTimeFormatter JODA_DATE_FORMATTER = org.joda.time.format.DateTimeFormat.forPattern(DATE_FORMAT);
	
	/**
	 * JODA_DATETIME_FORMATTER
	 */
	public static final org.joda.time.format.DateTimeFormatter JODA_DATETIME_FORMATTER = org.joda.time.format.DateTimeFormat.forPattern(DATETIME_FORMAT);
	
	/**
	 * Utility
	 */
	private DateFormatUtils(){}
}
