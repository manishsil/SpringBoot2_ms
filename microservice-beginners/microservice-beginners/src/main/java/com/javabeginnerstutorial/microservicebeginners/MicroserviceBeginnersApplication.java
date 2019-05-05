package com.javabeginnerstutorial.microservicebeginners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class MicroserviceBeginnersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBeginnersApplication.class, args);
	}

	@RequestMapping
	  public String helloWorld() {
	     return "Hello World";
	  }
}
