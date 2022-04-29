package com.flight.entities;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
	private int id;
	private String departure;
	private String arrival;
	private Date departuredate;
	private Date arrivaldate;
private Booking booking;

@OneToOne
@JoinColumn(name="id")
	public Booking getBooking() {
		return booking;
	}
	
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	@Id
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public Date getDeparturedate() {
		return departuredate;
	}
	public void setDeparturedate(Date departuredate) {
		this.departuredate = departuredate;
	}
	public Date getArrivaldate() {
		return arrivaldate;
	}
	public void setArrivaldate(Date arrivaldate) {
		this.arrivaldate = arrivaldate;
	}
	
	@Override
	public String toString() {
		return "Flight [id=" + id + ", departure=" + departure + ", arrival=" + arrival + ", departuredate="
				+ departuredate + ", arrivaldate=" + arrivaldate + "]";
	}

	
	public Flight(int id, String departure, String arrival, Date departuredate, Date arrivaldate,Booking booking) {
		super();
		this.id = id;
		this.departure = departure;
		this.arrival = arrival;
		this.departuredate = departuredate;
		this.arrivaldate = arrivaldate;
		this.booking = booking;
	}

	public Flight() {
		super();
	}
	
	
}

