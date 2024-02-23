package com.ahamed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionAutowiredApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependencyInjectionAutowiredApplication.class, args);
		
		Alien obj=context.getBean(Alien.class);
		obj.complie();   //Spring defaulty follow singlton design pattern  it will create nly one instance of the class 
		
//		Alien obj1=context.getBean(Alien.class);
//		obj1.complie();
	}

}
