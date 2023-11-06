package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.assignment.controller")
public class Assignment1CalculatorApplication {
	public static void main(String[] args) {
		SpringApplication.run(Assignment1CalculatorApplication.class, args);
	}
}
