package com.carona.restproject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		ApplicationContext appContext =
		SpringApplication.run(RestServiceApplication.class, args);
	
	for(String name: appContext.getBeanDefinitionNames()) {
		System.out.println(name);
	}
	
	}

}