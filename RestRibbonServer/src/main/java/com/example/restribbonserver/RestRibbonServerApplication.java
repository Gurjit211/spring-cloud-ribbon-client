package com.example.restribbonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestRibbonServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestRibbonServerApplication.class, args);
    }
}
