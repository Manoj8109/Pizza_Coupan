package com.onlinepizza.exceptions;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.onlinepizza.service.CoupanServiceImpl;

@ControllerAdvice
public class GlobalPizzaExceptionHandler extends ResponseEntityExceptionHandler{
	Logger logger=LoggerFactory.getLogger(CoupanServiceImpl.class);
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDate.now());
		body.put("status", status.value());

		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(x -> x.getDefaultMessage())
				.collect(Collectors.toList());

		body.put("errors", errors);

		return new ResponseEntity<>(body, headers, status);
	}
	@ExceptionHandler(CoupanIdNotFoundException.class)
	public ResponseEntity<?>CoupanIdNotFoundException(CoupanIdNotFoundException e,WebRequest request){
		ErrorDetails errorDetails = new ErrorDetails(new Date(),e.getMessage(), request.getDescription(false));
		logger.trace("CoupanIdNotFoundException thrown");
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
}
