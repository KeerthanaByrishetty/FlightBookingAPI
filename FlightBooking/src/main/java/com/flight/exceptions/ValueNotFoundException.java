package com.flight.exceptions;

public class ValueNotFoundException extends RuntimeException {
	
	private String message;

	public ValueNotFoundException(String message) {
		super(message);
		this.message=message;
		
	}
	public ValueNotFoundException() {
		
	}

}
