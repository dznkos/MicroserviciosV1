package com.call.telco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.call.demo.model.entity"})
@SpringBootApplication
public class TelcoUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelcoUsuariosApplication.class, args);
	}

}
