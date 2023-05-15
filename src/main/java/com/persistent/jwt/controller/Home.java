package com.persistent.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Home {
	
	@GetMapping
	public String HomePage() {
		return "This is private page";
	}

}
