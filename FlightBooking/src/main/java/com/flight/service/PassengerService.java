package com.flight.service;

import java.util.List;
import java.util.Optional;

import com.flight.entities.Passenger;
import com.flight.exceptions.PassengerNotFoundException;

public interface PassengerService {
	public List<Passenger> getPassengers();
	public Passenger addPassenger(Passenger passenger );
	public Passenger updatePassenger(Passenger passenger);
	public Passenger getPassengerById(int passengerid)throws PassengerNotFoundException;
	public void deletePassenger(int passengerid);
	public List<Passenger> GetRelatedPassenger();
	public List<Passenger> GetMalePassenger();


}
