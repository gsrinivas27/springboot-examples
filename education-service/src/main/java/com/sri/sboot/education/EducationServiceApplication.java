package com.sri.sboot.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EducationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducationServiceApplication.class, args);
	}
}
