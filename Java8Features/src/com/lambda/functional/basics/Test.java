package com.lambda.functional.basics;

public class Test {

	public static void main(String[] args) {
		
//		A a = new C();      //normal way
//		a.myMethod();
		
//		A a= () -> System.out.println("Inside myMethod");
//		a.myMethod();
		
		A result = (a,b) -> System.out.println(a*b);  //Here we dont ned anymore C class to implement A interface.
		result.myMethod(2, 8);

	}



}
