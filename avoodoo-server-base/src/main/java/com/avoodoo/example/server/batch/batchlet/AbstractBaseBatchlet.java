package com.avoodoo.example.server.batch.batchlet;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Properties;


import javax.batch.api.AbstractBatchlet;
import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.context.JobContext;
import javax.batch.runtime.context.StepContext;
import javax.inject.Inject;

import org.apache.log4j.Logger;


/**
 * @author frank
 *
 */
public abstract class AbstractBaseBatchlet extends AbstractBatchlet {

	private static final String BATCH_BASE_PROPERTIES = "batchBaseProperties";
	
	@Inject
	private static Logger LOG;
	
	@Inject
	private JobContext jobContext;
	
	@Inject
	private StepContext stepContext;
	
	private LocalDate accrualDate;
	private Properties batchBaseProperties;
	private String contextId;
	private String dataname;
	private Integer numInstance;
	private String invocationTreeId;
	private String overrideParam;
	
	
	/**
	 * Saves the value under key for the job,
	 * {@link #getJobProperty(String)}
	 * @param key
	 * @param value
	 * @return
	 */
	protected Object putJobProperty(String key, Object value) {
		return batchBaseProperties.put(key, value);
	}
	
	/**
	 * Job property of the given key. 
	 * If the property is set with {@link #putJobProperty(String, Object)} read it from here
	 * @param key
	 * @return - value to key
	 */
	protected Object getJobProperty(String key) {
		Object prop = batchBaseProperties.get(key);
		if  (null == prop) {
			prop = jobContext.getProperties().get(key);
		}
		return prop;
	}
	
	@Override
	public String process() throws Exception {		
				
		try {
			long executionId = jobContext.getExecutionId();
			initMember(executionId);
			LOG.info(MessageFormat.format("process() is called with executionId: {0}", executionId));
			LOG.info(toString());
			
			initBatchBaseProperties();
			return process(accrualDate, overrideParam);
		}
		catch(Exception e) {
			LOG.error(e);
			throw e;
		}
	}
	
	/**
	 * Sub-classes implement this method.
	 * @param accrualDate - defines per which date the batch should run.
	 * @param overrideParam - optional parameter should only be used exceptional 
	 * @return - Exit state of the batchlet
	 * @throws Exception
	 */
	public abstract String process(LocalDate accrualDate, String overrideParam) throws Exception;
	
	
	private void initBatchBaseProperties() throws Exception {
		batchBaseProperties = (Properties) jobContext.getProperties().get(BATCH_BASE_PROPERTIES);
		if (null == batchBaseProperties) {
			batchBaseProperties = (Properties) stepContext.getPersistentUserData();
			if (null == batchBaseProperties) {
				batchBaseProperties = new Properties();
			}
			jobContext.getProperties().put(BATCH_BASE_PROPERTIES, batchBaseProperties);
		}
		else {
			stepContext.setPersistentUserData(batchBaseProperties);
		}
	}
	
	/**
	 * Takes the properties of the jobcontext to the Batchlet
	 * 
	 * @param executionId
	 */
	private void initMember(long executionId) {
		Properties prop = BatchRuntime.getJobOperator().getParameters(executionId);
		contextId = prop.getProperty("contextId");
		dataname = prop.getProperty("dataname");
		invocationTreeId = prop.getProperty("invocationTreeId");
		
		String tmpAccrualDate = prop.getProperty("accrualDate");
		accrualDate = LocalDate.parse(tmpAccrualDate);
		
		overrideParam = prop.getProperty("overrideParam", "");
		
		String tmpNumInstance = prop.getProperty("numInstance");
		if (!tmpNumInstance.isEmpty()) {
			numInstance = Integer.parseInt(tmpNumInstance);
		}
	}	

	public LocalDate getAccrualDate() {
		return accrualDate;
	}

	public void setAccrualDate(LocalDate accrualDate) {
		this.accrualDate = accrualDate;
	}

	public Properties getBatchBaseProperties() {
		return batchBaseProperties;
	}

	public void setBatchBaseProperties(Properties batchBaseProperties) {
		this.batchBaseProperties = batchBaseProperties;
	}
	
	/**
	 * @return - the context of the invoking component.
	 */
	public String getContextId() {
		return contextId;
	}

	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	public String getDataname() {
		return dataname;
	}

	public void setDataname(String dataname) {
		this.dataname = dataname;
	}

	public Integer getNumInstance() {
		return numInstance;
	}

	public void setNumInstance(Integer numInstance) {
		this.numInstance = numInstance;
	}

	public String getOverrideParam() {
		return overrideParam;
	}

	public void setOverrideParam(String overrideParam) {
		this.overrideParam = overrideParam;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName() +"\n");
		sb.append("\taccrualDate=" + accrualDate +"\n");
		sb.append("\tcontextId=" + contextId +"\n");
		sb.append("\tdataname= " + dataname +"\n");
		sb.append("\tnumInstance=" + numInstance +"\n");
		sb.append("\toverrideParam=" + overrideParam +"\n");
		return sb.toString();
	}


}
