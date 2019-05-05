package io.springboot.springboot.starter;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiAPP {

	public static void main(String[] args) {
		
		/*
		 * Commenting as port is already used using the code with changing the Port to
		 * Run Spring Boot Application 
		 */
		 SpringApplication.run(CourseApiAPP.class, args);
	
		 /*
		
		SpringApplication app = new SpringApplication(CourseApiAPP.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		app.run(args);
		*/

	}

}
