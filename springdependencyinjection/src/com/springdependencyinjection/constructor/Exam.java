package com.springdependencyinjection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

//		Student student=new Student(1,"Ahamed");
//		student.displayStudentInfo();
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Student student1=context.getBean("student",Student.class);
		student1.displayStudentInfo();
		
		Student sam=context.getBean("sam",Student.class);
		sam.displayStudentInfo();
		
		
		
		
		
		
	}
}
