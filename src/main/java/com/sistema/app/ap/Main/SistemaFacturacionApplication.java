package com.sistema.app.ap.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients
public class SistemaFacturacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaFacturacionApplication.class, args);
	}

}
