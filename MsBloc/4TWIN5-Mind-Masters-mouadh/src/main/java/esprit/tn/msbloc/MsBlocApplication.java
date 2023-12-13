package esprit.tn.msbloc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsBlocApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsBlocApplication.class, args);
    }

}
