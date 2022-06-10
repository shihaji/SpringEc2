package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("home")
	public String home() {
		
		return "hi from elastic bean stack ";
	}

}
