package com.example.verodegit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.annotation.PostConstruct;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class VerodegitApplication {

    public static void main(String[] args) {
        SpringApplication.run(VerodegitApplication.class, args);
    }

    @PostConstruct
    public void initializeLogger() {
        log.info("Setup complete!");
    }
}
