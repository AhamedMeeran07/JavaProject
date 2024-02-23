package com.ahamed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestResources{
	
	@Autowired
	RestRepository repo;
	
	@GetMapping("aliens")
	public  List<RestPojo> getAlien(){
		
		List<RestPojo> aliens=(List<RestPojo>) repo.findAll();
		
	
		
		return aliens;
	}

}
