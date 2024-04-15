package com.cos.alttmoa.handler;

import java.util.Map;

public class CustomValidationExcption extends RuntimeException{

	private Map<String, String> errorMap;
	
	public CustomValidationExcption(String message, Map<String, String> errorMap) {
		super(message);
		this.errorMap = errorMap;
	}

	public Map<String, String> getErrorMap() {
		return errorMap;
	}

	
	
	
	
}
