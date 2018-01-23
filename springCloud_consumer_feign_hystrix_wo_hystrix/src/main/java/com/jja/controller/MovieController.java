package com.jja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jja.UserFeignClient1;
import com.jja.entity.Users;

@RestController
public class MovieController {
	
	@Autowired
	private UserFeignClient1 userFeignClient;
	
	@GetMapping("/getObj/{id}")
	public Users getObj(@PathVariable("id")int id) {
		Users user = userFeignClient.getUser(id);
		return user;
	}
	
}
