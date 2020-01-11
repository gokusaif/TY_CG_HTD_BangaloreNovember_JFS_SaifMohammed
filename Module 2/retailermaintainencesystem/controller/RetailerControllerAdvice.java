package com.capgemini.retailermaintainencesystem.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailermaintainencesystem.dto.RetailerResponse;
import com.capgemini.retailermaintainencesystem.exceptions.RetailerException;

@RestControllerAdvice
public class RetailerControllerAdvice {
	
	@ExceptionHandler(RetailerException.class)
	public RetailerResponse userException(RetailerException e) {
		RetailerResponse response = new RetailerResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}

}
