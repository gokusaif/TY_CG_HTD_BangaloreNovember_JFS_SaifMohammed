package com.capgemini.empspringboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.empspringboot.dto.EmployeeResponse;
import com.capgemini.empspringboot.exception.EmployeeException;

@RestControllerAdvice
public class EmployeeControllerAdvice {
	
	@ExceptionHandler(EmployeeException.class)
	public EmployeeResponse handelEmployeeException(EmployeeException e) {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}
}
