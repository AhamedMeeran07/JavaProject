package com.Random;

import java.util.Random;

public class RandomClassDemo {

	public static void main(String[] args) {

		Random obj=new Random();
		
		int a = obj.nextInt(0, 10);
		int b= obj.nextInt(10);
		int c=obj.nextInt();
		System.out.println("a value is: "+a);
		System.out.println("a value is: "+b);
		System.out.println("a value is: "+c);

		
	}

}
