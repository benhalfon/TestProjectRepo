package com.example.demo.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

	
	@RequestMapping(value="", method = {RequestMethod.GET})
	public Object get() {
		return Map.of("ben","test");
	}
	
	
}
