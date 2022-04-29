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

import com.flight.entities.Passenger;
import com.flight.exceptions.PassengerNotFoundException;
import com.flight.service.PassengerService;

@RestController
public class PassengerController {
	@Autowired
	private PassengerService passengerservice;
	
	@GetMapping("/passenger")
	public List<Passenger>  getpassengers(){
		return this.passengerservice.getPassengers();
	}
	@PostMapping("/passenger")
	public Passenger addPassenger(@RequestBody Passenger passenger) {
		return this.passengerservice.addPassenger(passenger) ;
	}
	@PutMapping("/passenger")
	public Passenger updatePassenger(@RequestBody Passenger passenger) {
		return this.passengerservice.updatePassenger(passenger) ;	
	}
	
	@GetMapping("/passenger/{pid}")
	public ResponseEntity getPassengerById(@PathVariable("pid") int passengerid){
		return new ResponseEntity(passengerservice.getPassengerById(passengerid), HttpStatus.OK);
	}
	
	@DeleteMapping("/passenger/{passid}")
	public void deleteBooking(@PathVariable("passid") int passengerid) {
		this.passengerservice.deletePassenger(passengerid);	
	}
	
	@GetMapping("/relatedpassenger")
	public List<Passenger> GetRelatedPassenger(){
		return this.passengerservice.GetRelatedPassenger();
	}
	
	@GetMapping("/malepassenger")
	public List<Passenger> GetMalePassenger(){
		return this.passengerservice.GetMalePassenger();
	}

}
