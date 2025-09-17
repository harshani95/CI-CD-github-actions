package com.harshani.githubActions_CI.CD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/welcome")
	public String welcome(){
		return "CI/CD github actions";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
