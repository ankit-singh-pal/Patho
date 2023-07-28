package com.amrit.pathology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.amrit.pathology.controller", "com.amrit.pathology.repository","com.amrit.pathology.service"})
public class PathoLabApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PathoLabApplication.class, args);
	}

}
