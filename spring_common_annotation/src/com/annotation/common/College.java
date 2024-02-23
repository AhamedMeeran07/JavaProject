package com.annotation.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("collegeBean")
@Component
public class College {
	@Value("${college.name}")
	private String collegeName;
	//@Autowired 	if we use autowire here there is no need to write setter method
	private Principal principal;
	//@Autowired
	private Teacher teacher;
	
	
	
//	@Required
//	public void setCollegeName(String collegeName) {
//		this.collegeName = collegeName;
//	}

	//	public College(Principal principal) {
//		this.principal = principal;
//	}
    @Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("setter method");
	}
	
    @Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public void test() {
		principal.principalBean();
		teacher.teach();
		System.out.println("My college name is: "+collegeName);
		System.out.println("The method was working");
	}
}
