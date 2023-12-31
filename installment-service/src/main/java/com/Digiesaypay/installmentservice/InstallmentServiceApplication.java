package com.Digiesaypay.installmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class InstallmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstallmentServiceApplication.class, args);
	}

}
