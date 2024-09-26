package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class ExControllerAdvice {

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public String exHandler(Exception e) {
		log.error("[exceptionHandler] ex", e);
		log.info("Cause : {}", e.getCause());
		log.info("LocalizedMessage : {}", e.getLocalizedMessage());
		return "ExceptionHandler 처리됨" + e.getMessage();
		
	}
}
