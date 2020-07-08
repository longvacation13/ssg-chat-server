package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

	@RequestMapping("/welcome")
	public @ResponseBody String helloworld() {
		return "Spring Boot Hello World"; 
	}
}
