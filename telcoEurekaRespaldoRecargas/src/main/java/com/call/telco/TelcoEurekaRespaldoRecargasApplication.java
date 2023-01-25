package com.call.telco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TelcoEurekaRespaldoRecargasApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelcoEurekaRespaldoRecargasApplication.class, args);
	}

}
