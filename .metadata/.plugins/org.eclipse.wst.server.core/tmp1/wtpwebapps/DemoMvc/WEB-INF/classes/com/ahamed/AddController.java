package com.ahamed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController 
{
	@RequestMapping("name")
	public void add() {
		System.out.println("Add");
	}
}
