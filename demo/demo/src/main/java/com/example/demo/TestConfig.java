package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TestConfig {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TestConfig.class, args);
	}

}
