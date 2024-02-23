package com.ahamed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ahamed.dao.ContactDao;
import com.ahamed.model.User;

@Controller
public class UserController {
	
	@Autowired
	ContactDao contactDao;
	
	@RequestMapping("index")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("addUser")
	public String createContact(User user) {
		contactDao.save(user);
		return "index.jsp";
	}
	
	@RequestMapping("findUser")
	public ModelAndView showContact(@RequestParam int id) {
		
		ModelAndView mv= new ModelAndView("showContact.jsp");
		User user=contactDao.findById(id).orElse(new User());
		mv.addObject(user);
		return mv;
	}
	
	@RequestMapping("deleteUser")
	public ModelAndView deleteContact(@RequestParam int id) {
		
		ModelAndView mv= new ModelAndView("deleteContact.jsp");
		User user=contactDao.findById(id).orElse(new User());
		contactDao.deleteById(id);
		mv.addObject(user);
		return mv;
	}
	
	@RequestMapping("updateUser")
	public ModelAndView updateContact(User user) {
		
		ModelAndView mv= new ModelAndView("updateContact.jsp");
		user=contactDao.findById(user.getId()).orElse(new User());
		contactDao.deleteById(user.getId());
		
		mv.addObject(user);
		return mv;
	}
}
