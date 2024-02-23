package com.spring_autowire_concept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("octopusObject")
	private Heart heart;

//	public Human() {
//
//	}
	//@Autowired
//	public Human(Heart heart) {
//		this.heart = heart;
//	}

//	@Autowired
//	@Qualifier("humanObject")
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("setter method called");
//	}
	
	public void startPumping() {
		if(heart != null) {
		heart.pump();
		
		}
		else {
			System.out.println("you are dead");
		}
	}
	
}
