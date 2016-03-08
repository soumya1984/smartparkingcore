package com.smartparking.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan("com.smartparking")
@EnableAutoConfiguration
@Configuration

public class SmartParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartParkingApplication.class, args);
	}
	

}
