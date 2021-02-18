package com.example.m5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example*")
public class M5Application {

	public static void main(String[] args) {
		SpringApplication.run(M5Application.class, args);
	}

}
