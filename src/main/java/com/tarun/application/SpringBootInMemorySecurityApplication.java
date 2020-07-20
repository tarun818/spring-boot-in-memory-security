package com.tarun.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.tarun")
@SpringBootApplication
public class SpringBootInMemorySecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInMemorySecurityApplication.class, args);
	}

}
