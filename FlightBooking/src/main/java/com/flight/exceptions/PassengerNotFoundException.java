package com.flight.exceptions;

public class PassengerNotFoundException extends RuntimeException {
	
	private String message;
	

	public PassengerNotFoundException(String message) {
		super(message);
		this.message=message;
		
	}
	public PassengerNotFoundException() {
		
	}

}
