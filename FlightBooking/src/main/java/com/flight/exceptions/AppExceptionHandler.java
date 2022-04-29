package com.flight.exceptions;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class AppExceptionHandler  {
	
	@Value(value="${data.exception.message1}")
	private String message1;
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity handleUserNotFoundException(UserNotFoundException ex){
		
		return new ResponseEntity(message1, HttpStatus.NOT_FOUND);
		
	}
	
	@Value(value="${data.exception.message2}")
	private String message2;
	@ExceptionHandler(ValueNotFoundException.class)
	public ResponseEntity handleValueNotFoundException(ValueNotFoundException ex){
		
		return new ResponseEntity(message2, HttpStatus.NOT_FOUND);
		
		
	}
	
	@Value(value="${data.exception.message3}")
	private String message3;
	@ExceptionHandler(FlightNotFoundException.class)
	public ResponseEntity handleFlightNotFoundException(FlightNotFoundException ex){
		
		return new ResponseEntity(message3, HttpStatus.NOT_FOUND);
		
		
	}
	
	@Value(value="${data.exception.message4}")
	private String message4;
	@ExceptionHandler(BookingNotFoundException.class)
	public ResponseEntity handleBookingNotFoundException(BookingNotFoundException ex){
		
		return new ResponseEntity(message4, HttpStatus.NOT_FOUND);
		
		
	}
	
	@Value(value="${data.exception.message5}")
	private String message5;
	@ExceptionHandler(PassengerNotFoundException.class)
	public ResponseEntity handlePassengerNotFoundException(PassengerNotFoundException ex){
		
		return new ResponseEntity(message5, HttpStatus.NOT_FOUND);
		
		
	}

}
