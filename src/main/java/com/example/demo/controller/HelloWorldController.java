package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HelloWorldController {
      
	@ResponseStatus
	@GetMapping("/index.html")
	public String hello() {
		return "hello!";
	}
}
