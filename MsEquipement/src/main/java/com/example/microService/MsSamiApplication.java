package com.example.microService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsSamiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSamiApplication.class, args);
	}

}
