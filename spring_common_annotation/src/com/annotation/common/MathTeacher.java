package com.annotation.common;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {

		System.out.println("Hi, i am your match teacher");
	}

}
