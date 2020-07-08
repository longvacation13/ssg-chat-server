package com.example.testView;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SsgLiveChatV013Application {

	public static void main(String[] args) {
		SpringApplication.run(SsgLiveChatV013Application.class, args);
	}
	
	@GetMapping(value ="/test")
	public String HelloWorld() {
		return "Test World"; 
	}
}
