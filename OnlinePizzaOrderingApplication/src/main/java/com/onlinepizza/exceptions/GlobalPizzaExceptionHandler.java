package com.onlinepizza.exceptions;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.onlinepizza.service.CoupanServiceImpl;

@ControllerAdvice
public class GlobalPizzaExceptionHandler {
	Logger logger=LoggerFactory.getLogger(CoupanServiceImpl.class);
	
	@ExceptionHandler(CoupanIdNotFoundException.class)
	public ResponseEntity<?>CoupanIdNotFoundException(CoupanIdNotFoundException e,WebRequest request){
		ErrorDetails errorDetails = new ErrorDetails(new Date(),e.getMessage(), request.getDescription(false));
		logger.trace("CoupanIdNotFoundException thrown");
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
}
