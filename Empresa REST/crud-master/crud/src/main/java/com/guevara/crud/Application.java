package com.guevara.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration //defines this as a Spring Boot application
@ComponentScan("com.guevara")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
