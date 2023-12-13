package tn.esprit.eurekadiscovserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaDiscovServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscovServerApplication.class, args);
	}

}
