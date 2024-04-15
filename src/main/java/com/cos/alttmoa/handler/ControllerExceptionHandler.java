package com.cos.alttmoa.handler;

import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(CustomValidationExcption.class)
	public Map<String, String> vaildationException(CustomValidationExcption e) {
		return e.getErrorMap();
	}
}
