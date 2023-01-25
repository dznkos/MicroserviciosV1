package com.call.telco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TelcoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelcoConsumerApplication.class, args);
	}

}
