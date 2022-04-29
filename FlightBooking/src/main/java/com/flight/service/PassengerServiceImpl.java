package com.flight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.PassengerDAO;
import com.flight.entities.Booking;
import com.flight.entities.Passenger;
import com.flight.exceptions.PassengerNotFoundException;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerDAO passengerdao;
	@Override
	public List<Passenger> getPassengers() {
		return passengerdao.findAll();
	}
	@Override
	public Passenger addPassenger(Passenger passenger) {
	passengerdao.save(passenger);
		return passenger;
	}
	@Override
	public Passenger updatePassenger(Passenger passenger) {
		passengerdao.save(passenger);
		return passenger;
	}
	@Override
	public Passenger getPassengerById(int passengerid)throws PassengerNotFoundException {
		Passenger p;
		if(passengerdao.findById(passengerid).isEmpty()) {
			throw new PassengerNotFoundException();
		}
		else {
			p=passengerdao.findById(passengerid).get();
		}
		return p;
	}
	@Override
	public void deletePassenger(int passengerid) {
		Passenger p=passengerdao.getById(passengerid);
		passengerdao.delete(p);	
	}
	
	@Override
	public List<Passenger> GetRelatedPassenger() {
		return passengerdao.getPassenger();
	}
	
	
	@Override
	public List<Passenger> GetMalePassenger() {
		return passengerdao.getMale();
	}
}
