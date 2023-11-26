package com.bmicalculator.bmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BmiApplication {

	public static void main(String[] args) {
		System.err.println("Test Main");
		SpringApplication.run(BmiApplication.class, args);
	}

}
