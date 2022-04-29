package com.flight.exceptions;

public class FlightNotFoundException extends RuntimeException {
	
	private String message;
	

	public FlightNotFoundException(String message) {
		super(message);
		this.message=message;
		
	}
	public FlightNotFoundException() {
		
	}

}
