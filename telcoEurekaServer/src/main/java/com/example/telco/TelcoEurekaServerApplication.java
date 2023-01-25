package com.example.telco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TelcoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelcoEurekaServerApplication.class, args);
	}

}
