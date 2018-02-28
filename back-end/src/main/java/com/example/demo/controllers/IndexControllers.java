package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexControllers {

	@GetMapping("/")
	public String index() {
		return "redirect:/index.html";
	}
	
}
