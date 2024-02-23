package com.ahamed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ahamed.dao.EmployeeDao;
import com.ahamed.model.User;



@Controller
public class UserController {
	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping("Home")
	public String home(User user) {
		employeeDao.save(user);
		return "Home.jsp";
	}

}
