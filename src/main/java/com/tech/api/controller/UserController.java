package com.tech.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/api")
	public String home() {
		return "Welcome to Docker Jenkins Integration";
	}
	
}
