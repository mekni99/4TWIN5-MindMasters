package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("foyerMs", r -> r.path("/foyer/**")
                        .uri("http://localhost:8082/"))
                .route("blocMs", r -> r.path("/bloc/**")
                        .uri("http://localhost:60085/"))
                .route("chambreMs", r -> r.path("/chambre/**")
                        .uri("http://localhost:8080/"))
                .route("equipementMs", r -> r.path("/equipement/**")
                        .uri("http://localhost:8082/"))
                .route("restaurantMs", r -> r.path("/restaurant/**")
                        .uri("http://localhost:8082/"))
                .route("universiteMs", r -> r.path("/universites/**")
                        .uri("http://localhost:8080/"))
                .build();
    }
}
