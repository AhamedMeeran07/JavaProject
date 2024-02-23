package com.ahamed;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private int lapId;
	private String brand;
	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lapId=" + lapId + ", brand=" + brand + "]";
	}
	
	
	
	
	

}
