package com.capgemini.retailermaintainencesystem.exceptions;

public class RetailerException extends RuntimeException{
	
	String msg;
	
	public RetailerException(String msg) {
		this.msg=msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
	
	

}
