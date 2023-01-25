package com.call.telco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TelcoServicioInternetApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelcoServicioInternetApplication.class, args);
	}

}
