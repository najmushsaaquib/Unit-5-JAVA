package com.masai.exceptions;

public class InvalidURIException extends RuntimeException {
	
	public InvalidURIException() {
		// TODO Auto-generated constructor stub
	}
	
	public InvalidURIException(String sms) {
		
		super(sms);
	}

}
