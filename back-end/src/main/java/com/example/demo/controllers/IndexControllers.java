package com.example.demo.controllers;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.ServletContextResource;

@RestController
public class IndexControllers {

	@Autowired
    private ServletContext servletContext;
	
	@GetMapping("/")
	public Resource index() {
		return new ServletContextResource(servletContext, "static/index.html");
	}
	
}
