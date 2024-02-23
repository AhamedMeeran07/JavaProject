package com.ahamed;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ahamed.model.Alien;



@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1")int i,@RequestParam("num2")int j,Model m)
	{
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("result");
	int  num3=i + j;
		m.addAttribute("num3", num3);
	
		return "result" ;
	}
	
	
@RequestMapping("addName")
	public String addName(Alien a) {

	return "result";
	}
}
