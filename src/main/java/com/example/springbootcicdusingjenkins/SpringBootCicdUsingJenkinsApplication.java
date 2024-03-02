package com.example.springbootcicdusingjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCicdUsingJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCicdUsingJenkinsApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		return "Going in right direction!!!";
	}

}
