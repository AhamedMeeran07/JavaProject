package com.annotation.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

//		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//		System.out.println("bean file loaded");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfiq.class);
		System.out.println("Collegeconfig loaded");
		College college=context.getBean("college",College.class);
		System.out.println("The bean cretaed by spring: "+college);
		college.test();
//		((AnnotationConfigApplicationContext)context).close();
		context.close();
	
		
		
		
		
	}
 
}
