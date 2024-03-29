package com.simo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientProduitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientProduitApplication.class, args);
	}

}
