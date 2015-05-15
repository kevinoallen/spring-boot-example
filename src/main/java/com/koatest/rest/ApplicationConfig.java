package com.koatest.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApplicationConfig {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ctxt = SpringApplication.run(ApplicationConfig.class, args);
    }

}
