package com.brownfield;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BrownFieldEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrownFieldEurekaApplication.class, args);
	}
}
