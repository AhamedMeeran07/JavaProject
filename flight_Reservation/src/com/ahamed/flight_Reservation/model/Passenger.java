package com.ahamed.flight_Reservation.model;

public class Passenger extends AbstructModel {

	private String firstName;	
	private String middleName;
	private String lastName;
	private String email;
	private String phoneNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

	
}
