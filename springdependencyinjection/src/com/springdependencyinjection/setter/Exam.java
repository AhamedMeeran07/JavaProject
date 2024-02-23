package com.springdependencyinjection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
//		Student student=new Student();
//		student.setStudentName("Ahamed");
//		
//		student.displayStudentInfo();
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student1=context.getBean("student",Student.class);
		student1.displayStudentInfo();
		
		
		Student student2=context.getBean("student2",Student.class);
		student2.displayStudentInfo();
		
		
		
	}
}
