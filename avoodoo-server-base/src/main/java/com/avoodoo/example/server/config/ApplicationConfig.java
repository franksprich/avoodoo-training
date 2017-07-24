package com.avoodoo.example.server.config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;

/**
 * Is a cache for config values. Use this class to retrieve configuration values. Cache is static so we cache values global (VM) scope.
 * @author frank
 *
 */
public class ApplicationConfig {
	
	private static final String APPLICATION = "serverbase.application";
	private static final String ENV = "serverbase.env";
	private static final String GLOBAL_CONFIG_PATH = "GLOBAL_CONFIG_PATH";
	
	private static Map<String, String> cache = Collections.synchronizedMap(new HashMap<>());
	
//	@Inject 
//	private static Logger LOG;
	
	private static Logger LOG = Logger.getLogger(ApplicationConfig.class);
	
	public static final String DEFAULT_PROPERTY_FILE_NAME = "config.properties";
	
	
	/**
	 * Get value from property
	 * @param key
	 * @return value (even if null)
	 */
	public static String getValue(String key) {
		lazyLoad();				
		return cache.get(key);
	}
	
	/**
	 * Get value from property - configurable if throwing a exception in case null
	 * @param key
	 * @param isNullable
	 * @return value 
	 * @throws RuntimeException
	 */
	public static String getValue(String key, boolean isNullable) throws RuntimeException {
		lazyLoad();				
		String result = cache.get(key);
		if (!isNullable && null == result) {
			throw new RuntimeException("No value (non nullable) found in configuration for key: " +key);
		}
		return result;
	}
	
	/**
	 * Get Boolean value from property
	 * @param key
	 * @return a Boolean value
	 */
	public static Boolean getValueAsBoolean(String key) {	
		lazyLoad();		
		return Boolean.parseBoolean(cache.get(key));
	}
	
	/**
	 * Get Boolean value from property - cGet Boolean value from propertyonfigurable if throwing a exception in case null
	 * @param key
	 * @param isNullable
	 * @return a Boolean value
	 * @throws RuntimeException
	 */
	public static Boolean getValueAsBoolean(String key, boolean isNullable) throws RuntimeException {
		lazyLoad();
		String tmpResult = cache.get(key);
		if (!isNullable && null == tmpResult) {
			throw new RuntimeException("No value (non nullable) found in configuration for key: " +key);
		}
		return Boolean.parseBoolean(tmpResult);
	}
	
	/**
	 * Loads cache during first call to {@link #getValue(String, boolean)}
	 */
	private static void lazyLoad() {
		if (cache.isEmpty()) {
			init();
		}
	}
	
	/**
	 * Init (load) from an expected config.properties file on the classpath {@link #DEFAULT_PROPERTY_FILE_NAME}
	 */
	public static void init() {
		loadFromRelativePath(DEFAULT_PROPERTY_FILE_NAME);
		
		String path = System.getenv(GLOBAL_CONFIG_PATH);
		if (null != path && !path.isEmpty() && path.contains(".properties")){
			loadFromAbsolutPath(path);
		}
		else{
			LOG.error(MessageFormat.format("Path under ENVIRONMENT variable ''{0}'' is NULL or is empty or does not contain .properties phrase.", GLOBAL_CONFIG_PATH));
		}
	}
	
	/**
	 * Loads properties form a given relative input path - 
	 * e.g. the file {@link #DEFAULT_PROPERTY_FILE_NAME} which is expected on the classpath.
	 * @param path
	 */
	public static void loadFromRelativePath(String path) {		
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		try(InputStream in = cl.getResourceAsStream(path)){
			Properties prop = new Properties();
			prop.load(in);
			for (String key : prop.stringPropertyNames()){
				cache.put(key, prop.getProperty(key));
			}
		} catch (Exception e) {
			LOG.error("", e);
		}
	}
	
	/**
	 * Loads properties form a given absolute input path
	 * @param path
	 */
	public static void loadFromAbsolutPath(String path) {
		try(InputStream in = new FileInputStream(Paths.get(path).toFile())){
			Properties prop = new Properties();
			prop.load(in);
			for (String key : prop.stringPropertyNames()){
				cache.put(key, prop.getProperty(key));
			}
		}
		catch (Exception e) {
			LOG.error("", e);
		}
	}
	
	/**
	 * Loads properties form a given InputStream
	 * @param path
	 */
	public static void loadFromInputStream(InputStream fromOutside) {		
		try(InputStream in = fromOutside){
			Properties prop = new Properties();
			prop.load(in);
			for (String key : prop.stringPropertyNames()){
				cache.put(key, prop.getProperty(key));
			}
		}
		catch (Exception e) {
			LOG.error("", e);
		}
	}
	
	/**
	 * Get a set of all configuration parameter names
	 * @return
	 */
	public static Set<String> getNames() {
		lazyLoad();
		return cache.keySet();
	}
	
	/**
	 * Provides the value of the property {@link #APPLICATION} form {@link #DEFAULT_PROPERTY_FILE_NAME}.
	 * It defines the name of the application.
	 * @return
	 * @throws RuntimeException
	 */
	public static String getApplicationId() throws RuntimeException {
		return getValue(APPLICATION, false);
	}
	
	/**
	 * Provides the value of the property {@link #ENV} form {@link #DEFAULT_PROPERTY_FILE_NAME}.
	 * It defines the name of the environment.
	 * @return
	 * @throws RuntimeException
	 */
	public static String getEnvironment() throws RuntimeException {
		return getValue(ENV, false);
	}
	
	/**
	 * Print all key/value pairs from the cache.
	 */
	public static String print(){
		return new ApplicationConfig().toString();
	}

	@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		sb.append(MessageFormat.format("\nApplicationConfig [Application: ''{0}''; Stage: ''{1}'']\n", getApplicationId(), getEnvironment()));
		
		/* Convenient way to print and/or iterate over Properties */
//		Properties prop = new Properties();
//		prop.putAll(cache);
//		for(String key : prop.stringPropertyNames()){
//			sb.append(MessageFormat.format("\t{0} = {1}\n", key, prop.get(key)));
//	    }    
		
		/* A TreeMap has a natural order which leads to order of  the output (alphabetical) */
		TreeMap<String, String> map = new TreeMap<>();
		map.putAll(cache);
		for (Entry<String, String> entry : map.entrySet()) {
			sb.append(MessageFormat.format("\t{0} = {1}\n", entry.getKey(), entry.getValue()));
		}

		return sb.toString();
	}

	/**
	 * Utility
	 */
	private ApplicationConfig() {
		/* Utility */
	}

	
	/**
	 * Only for testing purpose
	 * @param args
	 */
//	public static void main(String[] args){
//		ApplicationConfig ac = new ApplicationConfig();
//		System.out.println(ApplicationConfig.getNames());
//		System.out.println(ac.toString());
//	}
	
}
