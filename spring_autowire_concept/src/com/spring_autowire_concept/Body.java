package com.spring_autowire_concept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");
	Human human=context.getBean("human",Human.class);
	human.startPumping(); 
	}

}
