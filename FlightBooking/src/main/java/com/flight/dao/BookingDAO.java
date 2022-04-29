package com.flight.dao;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.flight.entities.Booking;


public interface BookingDAO  extends JpaRepository<Booking, Integer>, CrudRepository<Booking, Integer>{
	@Query("select b from Booking b where bookingid=1")
	List<Booking> getBooking();
	@Query("select b from Booking b where bookingdate>'2022-04-01'")
	List<Booking> getBookingdate();
	
	

}
