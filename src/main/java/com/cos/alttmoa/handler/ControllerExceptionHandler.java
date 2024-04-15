package com.cos.alttmoa.handler;

import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cos.alttmoa.dto.CMRespDTO;
import com.cos.alttmoa.util.Script;

@RestController
@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(CustomValidationExcption.class) 
	public String vaildationException(CustomValidationExcption e) {
		return Script.back(e.getErrorMap().toString()); 
	}	
	
	
}
