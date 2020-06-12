package com.cc.nacos.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryApplication {

    // run
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplication.class, args);
    }
}
