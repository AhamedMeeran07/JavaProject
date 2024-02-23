package com.ahamed.model;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	private int id;
	private String userName;
	private String mobileNumber;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", mobileNumber=" + mobileNumber + "]";

	}
	
}
