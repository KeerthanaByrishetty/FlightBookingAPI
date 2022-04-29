package com.flight.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entities.Booking;
import com.flight.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/bookingpassenger")
	public List<Booking>  getAllPassengerBookings(){
		return this.bookingService.getAllPassengerBookings();
	}
	
	@GetMapping("/booking")
	public List<Booking> getBookings(){
		return this.bookingService.getBookings();
	}
	
	@PostMapping("/booking")
	public Booking addBooking(@RequestBody Booking booking) {
		return this.bookingService.addBooking(booking);
	}
	
	@PutMapping("/booking")
	public Booking updateBooking(@RequestBody Booking booking) {
		return this.bookingService.updateBooking(booking);
	}
	
	@GetMapping("/booking/{bid}")
	public ResponseEntity getBookingId(@PathVariable("bid") int id){
		return new ResponseEntity(bookingService.getBookingId(id), HttpStatus.OK);
		
	}
	@DeleteMapping("/booking/{bookingid}")
	public void deleteBooking(@PathVariable("bookingid") int id) {
		this.bookingService.deleteBooking(id);
		
	}
	
	@GetMapping("relatedbooking")
	public List<Booking> GetRelatedBooking(){
		return this.bookingService.GetRelatedBooking();
	}
	
	@GetMapping("relateddate")
	public List<Booking> getRelatedDate(){
		return this.bookingService.getRelatedDate();
	}

	
	

}
