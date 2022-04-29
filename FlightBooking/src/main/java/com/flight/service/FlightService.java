package com.flight.service;

import java.util.List;
import java.util.Optional;

import com.flight.entities.Flight;
import com.flight.exceptions.FlightNotFoundException;

public interface FlightService {
	public List<Flight> getAllFlightBookings();
	public List<Flight> getAllFlights();
    public Optional<Flight> getFlightById(Integer id);
	public Flight addFlights(Flight flight);
	public Flight updateFlights(Flight flight);
	public Flight getId(int id)throws FlightNotFoundException;
	public void deleteFlight(int id);
	public List<Flight> getRelatedFlight();
	
	
}
