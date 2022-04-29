package com.flight.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.flight.entities.Flight;

public interface FlightDAO extends JpaRepository<Flight, Integer>, CrudRepository<Flight, Integer> {
	
	@Query("Select f from Flight f join Booking b on f.id=b.id")
	List<Flight> getByBookingFlights();
	
	@Query("select f from Flight f where departure='Delhi' and arrival='London'")
	List<Flight> GetFlights();

}
