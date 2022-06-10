package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("home")
	public String home() {
		
		return "hi from ebs ";
	}
	
	
	@GetMapping("home1")
	public String home1() {
		
		return "hello from home1";
	}
	
	

}
