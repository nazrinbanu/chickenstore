package com.chickenstore.farisha_chicken.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ChickenExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ChickenResponse> chickenNotFoundResponse(ChickenException exc){
		
		ChickenResponse response=new ChickenResponse();
		
		response.setStatus(HttpStatus.NOT_FOUND.value());
		
		response.setMessage(exc.getMessage());
		
		response.setTimestamp(System.currentTimeMillis());		
		
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ChickenResponse> otherException(Exception exec){
		
		ChickenResponse response=new ChickenResponse();
		
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		
		response.setMessage(exec.getMessage());
		
		response.setTimestamp(System.currentTimeMillis());		
		
		return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
	}

}
