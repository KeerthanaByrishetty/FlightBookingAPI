package com.flight.entities;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passenger {
	private int passengerid;
	private String firstname;
	private String lastname;
	private int age;
	private char gender;
	private String passportno;
	

	@Id
	public int getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPassportno() {
		return passportno;
	}
	public void setPassportno(String passportno) {
		this.passportno = passportno;
	}
	@Override
	public String toString() {
		return "Passenger [passengerid=" + passengerid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", age=" + age + ", gender=" + gender + ", passportno=" + passportno + "]";
	}
	
	public Passenger( int passengerid, String firstname, String lastname, int age, char gender,
			String passportno) {
		super();
		
		this.passengerid = passengerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.passportno = passportno;
		
	}
	public Passenger() {
		super();
		
	}
	
}


