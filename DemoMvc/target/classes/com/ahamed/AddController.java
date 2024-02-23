package com.ahamed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddController 
{
	@RequestMapping("/name")
	public void add() {
		System.out.println("I am here");
	}
}
