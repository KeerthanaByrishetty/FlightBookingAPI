package com.flight.entities;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import javax.persistence.Table;



@Entity
@Table(name="booking")
public class Booking {
	private int id;
	private int bookingid;
	private Date bookingdate;
	private Date traveldate;
	
	private Passenger passenger;
	
	@OneToOne
	@JoinColumn(name="passengerid")
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	@Id
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
    
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public Date getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}
	public Date getTraveldate() {
		return traveldate;
	}
	public void setTraveldate(Date traveldate) {
		this.traveldate = traveldate;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookingid=" + bookingid + ", bookingdate=" + bookingdate + ", traveldate="
				+ traveldate +  "]";
	}
	public Booking(int id, int bookingid, Date bookingdate, Date traveldate) {
		super();
		this.id = id;
		this.bookingid = bookingid;
		this.bookingdate = bookingdate;
		this.traveldate = traveldate;
	}
	
	public Booking() {
		super();
		
	}
	

}


