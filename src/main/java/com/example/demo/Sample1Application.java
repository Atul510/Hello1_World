package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sample1Application {
	
	@GetMapping
	public String HelloWorld() {
		return "Hello World, How are you?";
	}

	public static void main(String[] args) {
		SpringApplication.run(Sample1Application.class, args);
	}

}
