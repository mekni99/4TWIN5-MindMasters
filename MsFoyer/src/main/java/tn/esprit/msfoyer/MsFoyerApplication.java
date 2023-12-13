package tn.esprit.msfoyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsFoyerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFoyerApplication.class, args);
	}

}
