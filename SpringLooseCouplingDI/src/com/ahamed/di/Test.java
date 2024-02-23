package com.ahamed.di;

public class Test {
	
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void displayService() {
		service.callingService();
	}

}
