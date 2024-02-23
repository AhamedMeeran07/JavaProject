package com.annotation.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.annotation.common")
@PropertySource("classpath:college-name.properties")
public class CollegeConfiq {
	/*
	@Bean
	public Teacher mathTeacher() {
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalBean() {
	return new Principal();
}
	//@Bean(name = {"colBean","col2"})
	@Bean
	public College collegeBean() {
		College college=new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacher());
		return college;
	}
	*/
}
