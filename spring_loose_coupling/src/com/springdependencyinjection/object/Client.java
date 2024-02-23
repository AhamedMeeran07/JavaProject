package com.springdependencyinjection.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

//		Student student = new Student();
//		MathCheat cheat = new MathCheat();
//		student.setMathCheat(cheat);
//		student.cheating();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");
		System.out.println("bean xml file is loaded");
		Student student=context.getBean("stu",Student.class);
		student.cheating();
		
	
		
		
		
		
	}
 
}
