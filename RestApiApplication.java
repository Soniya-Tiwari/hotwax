package com.Assignment.app.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

}
