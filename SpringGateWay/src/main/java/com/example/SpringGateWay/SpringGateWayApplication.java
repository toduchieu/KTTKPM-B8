package com.example.SpringGateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGateWayApplication.class, args);
	}

}
