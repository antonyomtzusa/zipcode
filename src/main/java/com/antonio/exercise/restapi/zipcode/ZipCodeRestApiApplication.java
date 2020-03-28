package com.antonio.exercise.restapi.zipcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.mangofactory.swagger.plugin.EnableSwagger;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //(scanBasePackages="com.antonio.exercise.restapi")
@EnableSwagger
public class ZipCodeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipCodeRestApiApplication.class, args);
	}

	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ZipCodeRestApiApplication.class);
	}
}
