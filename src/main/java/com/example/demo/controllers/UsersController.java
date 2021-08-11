package com.example.demo.controllers;

import java.util.Collections;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

	
	@RequestMapping(value="", method = {RequestMethod.GET})
	public Object get() {
		System.err.println("Hello, logs!");
		return Collections.singletonMap("ben", "test");
	}
	
	
}
