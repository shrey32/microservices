package com.shrey.microservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shrey.microservices.pojo.User;
import com.shrey.microservices.service.UserService;

@RestController
public class SimpleController {

	@Autowired
	UserService userService;

	@GetMapping("/user/userByName/{firstName}")
	public User getUserByName(@PathVariable String firstName) {
		return userService.getUserByName(firstName);
	}

	@GetMapping("/user/allUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

}
