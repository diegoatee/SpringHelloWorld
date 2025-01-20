package com.diegoatee.SpringQuickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
3 ways to run the application using IntelliJ IDEA
	1. Press the "run" button on IntelliJ.
	2. Using the terminal, type "./mvnw spring-boot:run"
	3. Via a JAR file
		3a) Type "./mvnw clean package" in the terminal. This will create a JAR file inside the "target" directory.
		3b) Type "java -jar [NAME_OF_JARFILE]" in the terminal

Once you have run the application, visit "http://localhost:8080/hello"

What happens if you include "?name=Amy" right after the "hello"?
 */

@SpringBootApplication //Contains @Configuration, @EnableAutoConfiguration, and @ComponentScan. Essentially, this denotes the start of your Spring Boot application.
@RestController		   //Allows for the creation of RESTful endpoints. In this program, we will utilize the "GET" HTTP method
public class SpringQuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringQuickstartApplication.class, args); //This will allow you to start the application
	}

	@GetMapping("/hello") //Essentially, when a GET request is sent to the server (visiting http://localhost:8080/hello), the "hello" function will be called.
	public String hello(@RequestParam(value = "name", defaultValue = "world") String name) { //If the "name" parameter is not, specified, then "Hello, world!" will be printed by default. Else, the specified parameter will be printed.
		return String.format("Hello, %s!", name); //Will print on the webpage
	}

}
