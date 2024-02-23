package com.ahamed.di;

public class Airtel implements Service{


	@Override
	public void dataService() {
		System.out.println("data service called");
	}

	@Override
	public void smsService() {
		System.out.println("sms service called");
		
	}

	@Override
	public void callingService() {
		System.out.println("calling service called");
		
	}
	

}
