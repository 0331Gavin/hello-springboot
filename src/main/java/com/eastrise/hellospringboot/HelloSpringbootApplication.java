package com.eastrise.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringbootApplication {


	public static void main(String[] args) {
		System.out.printf("faaaaaa");
		SpringApplication.run(HelloSpringbootApplication.class, args);
	}
}
