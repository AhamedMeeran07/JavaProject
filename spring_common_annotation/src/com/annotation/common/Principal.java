package com.annotation.common;

import org.springframework.stereotype.Component;

@Component
public class Principal {
	
	public void principalBean() {
		System.out.println("principal bean method was running");
	}

}
