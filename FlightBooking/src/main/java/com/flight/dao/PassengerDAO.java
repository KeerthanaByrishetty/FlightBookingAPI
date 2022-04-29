package com.flight.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.flight.entities.Passenger;

public interface PassengerDAO extends JpaRepository<Passenger, Integer>, CrudRepository<Passenger, Integer> {
	
	@Query("select p from Passenger p where age>14")
	List<Passenger> getPassenger();
	
	@Query("select p from Passenger p where gender='m'")
	List<Passenger> getMale();

}
