package com.studentManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestExercise2Application extends SpringBootServletInitializer {

	private static final Logger logger= LoggerFactory.getLogger(RestExercise2Application.class);
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestExercise2Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(RestExercise2Application.class, args);
	}
	
	@RequestMapping(value="/")
	public String helloWorld()
	{
		logger.info("This is sample log message");
		return "Hello World from Bala";
	}

}
