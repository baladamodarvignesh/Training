package com.studentManagement.restExercise3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestExercise3Application {

//	@Value("${server.port}")
//	private String serverPort;
	
	public static void main(String[] args) {
		SpringApplication.run(RestExercise3Application.class, args);
	}

}
