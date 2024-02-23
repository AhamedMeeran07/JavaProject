package com.ahamed.staticblock;

public class StaticBlockDemo {
	
	static {
		System.out.println("Inside static block");
	}
	
	StaticBlockDemo(){
		System.out.println("Inside constructor");
	}

	public static void main(String[] args) {
		System.out.println("Inside main method");
		new StaticBlockDemo();

	}



	
}