package com.faith.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudDemoApplication.class, args);
		System.out.println("Welcome to Hibernate-REST-MySQL-Maven-Demo");
		System.out.println("Testing!");
	}

}
