package com.avoodoo.example.server.batchlet;

import java.util.HashMap;
import java.util.Map;

public enum BatchReturnCodeEnum {
	
	SUCCESS(0, "SUCCESS"), 
	INVALID_INPUT_DATA(10, "Invalid input data"),
	INVALID_PARAMETER(20, "Invalid parameter"),
	USER_ABORT(98, "System Error"),
	SYSTEM_ERROR(99, "User Abort");
	
	/* int representation of the enum */
	private int code;
	
	/* Message of the return code */
	private String msg;
	
	/* Create the lookup cache */
	private static final Map<Integer, BatchReturnCodeEnum> LOOKUP = new HashMap<>();
	
	/**
	 * Static block to initialize the LOOKUP cache.
	 */
	static {
		LOOKUP.put(0, SUCCESS);
		LOOKUP.put(10, INVALID_INPUT_DATA);
		LOOKUP.put(20, INVALID_PARAMETER);
		LOOKUP.put(98, USER_ABORT);
		LOOKUP.put(99, SYSTEM_ERROR);
	}
	
	/**
	 * Uses cache to lookup BatchReturnCodeEnum
	 * @param code
	 * @return
	 */
	public static BatchReturnCodeEnum lookup(int code) {
		return LOOKUP.get(code);
	}
	
	private BatchReturnCodeEnum(int code, String msg){
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
		
	

}
