package com.avoodoo.example.server.batchlet;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.avoodoo.example.server.batch.batchlet.AbstractBaseBatchlet;

public abstract class AbstractAvoodooBatchlet extends AbstractBaseBatchlet{
	
	@Inject
	private static Logger LOG;

	@Override
	public String process(LocalDate accrualDate, String overrideParam) throws Exception {
		try{
			String result = process(accrualDate, extractOverrideParameter(overrideParam));
			LOG.info(MessageFormat.format("Batchlet: {0} with parameter: {1} successfully executed. Return value: {2}", getClass().getSimpleName(), overrideParam, result));
			return result;
		}
		catch(Exception e){
			LOG.error(MessageFormat.format("An error has occured during executin of: {0}. Parameter: {1}", getClass().getSimpleName(), overrideParam), e);
			throw e;
		}
	}
	
	public static Map<String, String> extractOverrideParameter(String overrideParam) {
		Map<String, String> paramMap = new HashMap<>();
		if (null != overrideParam && !overrideParam.trim().isEmpty()) {
			try{
				String[] commaSplit = overrideParam.split(",");
				for (String commaString : commaSplit) {
					String[] equalSplit = commaString.split("=");
					paramMap.put(equalSplit[0], equalSplit[1]);
				}
			}
			catch(Exception e){
				LOG.error("Problem during extracting key/value map overrideParam", e);
			}
		}
		return paramMap;
	}
	
	
	/**
	 * Checks return code and throws exception, if return code is an error code.
	 * @param returnCode - a batch return code
	 * @throws Exception
	 */
	protected void validateBatchReturnCode(int returnCode) throws Exception {
		BatchReturnCodeEnum returnedCode = BatchReturnCodeEnum.lookup(returnCode);
		String msgTemplate = "Catch return error code: {0}";
		
		if (returnedCode == BatchReturnCodeEnum.SUCCESS){
			return;
		}
		else if (null == returnedCode){
			throw new Exception("Batch return error code: unkown");
		}
		else {
			throw new Exception(MessageFormat.format(msgTemplate, returnedCode.getMsg()));
		}		
	}

	public abstract String process(LocalDate accrualDate, Map<String, String> overrideParam);
	
}
