package com.ahamed.dao;

import org.springframework.data.repository.CrudRepository;

import com.ahamed.model.User;



public interface EmployeeDao extends CrudRepository<User, Integer>{

	
}
