package com.flight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.BookingDAO;
import com.flight.entities.Booking;
import com.flight.exceptions.BookingNotFoundException;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private BookingDAO bookingdao;

	@Override
	public List<Booking> getBookings() {
		
		return bookingdao.findAll();
	}

	@Override
	public Booking addBooking(Booking booking) {
		bookingdao.save(booking);
		return booking;
	}

	@Override
	public Booking updateBooking(Booking booking) {
		bookingdao.save(booking);
		return booking;
	}

	@Override
	public List<Booking> getAllPassengerBookings() {
		return null;
	}

	@Override
	public Booking getBookingId(int id)throws BookingNotFoundException {
		Booking b;
		if(bookingdao.findById(id).isEmpty()) {
			throw new BookingNotFoundException();		
			}
		else {
			b=bookingdao.findById(id).get();
		}
		return b;
	}

	@Override
	public void deleteBooking(int id) {
		Booking b=bookingdao.getById(id);
		bookingdao.delete(b);
		
		
	}
	@Override
	public List<Booking> getRelatedDate() {
		return bookingdao.getBookingdate();
	}
	
	@Override
	public List<Booking> GetRelatedBooking() {
		return bookingdao.getBooking();
	}
	
	

	
	
	

}
