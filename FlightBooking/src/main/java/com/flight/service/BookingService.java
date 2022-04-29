package com.flight.service;

import java.util.List;
import java.util.Optional;

import com.flight.entities.Booking;
import com.flight.exceptions.BookingNotFoundException;


public interface BookingService {
	public List<Booking> getAllPassengerBookings();
	public List<Booking> getBookings();
	public Booking getBookingId(int id)throws BookingNotFoundException;
    public void deleteBooking(int id);
	public Booking addBooking(Booking booking);
	public Booking updateBooking(Booking booking);
	public List<Booking> GetRelatedBooking();
	public List<Booking> getRelatedDate();

}
