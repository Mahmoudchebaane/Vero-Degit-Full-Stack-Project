package com.example.verodegit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean  // Bean definition for WebClient, which will be managed by Spring's context
    public WebClient webClient(WebClient.Builder builder) {
        return builder // Creating a WebClient bean with default headers
                .defaultHeader("Accept", "application/json")
                .build();
    }
}
