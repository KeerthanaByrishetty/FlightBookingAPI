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
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.flight.entities.Flight;

import com.flight.service.FlightService;

@RestController

public class FlightContoller {
	
	@Autowired
	private FlightService flightService;
	
	
	@RequestMapping("/home")
	public String hello() {
		return "Testing";
	}
	
	@GetMapping("/flightbooking")
	public List<Flight> getAllFlightBookings(){
		return this.flightService.getAllFlightBookings();
	}
	
	
	@GetMapping("/flight")
	public List<Flight> getAllFlights(){
		return this.flightService.getAllFlights();
	}
	
	@PostMapping("/flight")
	public Flight addFlights(@RequestBody Flight flight) {
		return this.flightService.addFlights(flight);
	}
	
	@PutMapping("/flight")
	public Flight updateFlights(@RequestBody Flight flight) {
		return this.flightService.updateFlights(flight);
	}
	
	@GetMapping("/flight/{flightid}")
	public ResponseEntity getId(@PathVariable("flightid") int id) {
		return new ResponseEntity (flightService.getId(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/flight/{fid}")
	public void deleteFlight(@PathVariable("fid") int id) {
		this.flightService.deleteFlight(id);
		
	}
	@GetMapping("/Relatedflight")
	public List<Flight> getRelatedFlight(){
		return this.flightService.getRelatedFlight();
	}

	
	

}
