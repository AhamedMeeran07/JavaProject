package com.lambda.functional.interfaces;

public class Test {

	public static void main(String[] args) {

			//Runnable r = new MyRunnableImpl();
//			Thread t = new Thread(r);              //Normal multithreading steps to implemnt runnable interface
//			t.start();
		
		Runnable r =()-> {
			
			for(int i =1;i<=10;i++) {
				System.out.println("Child Thread");    //Using lambda implemnt runnable interface
			}

		};
		
		Thread t = new Thread(r);
		t.start();
			
			for(int i =1;i<=10;i++) {
				System.out.println("Main Thread");
			}
	}

}
