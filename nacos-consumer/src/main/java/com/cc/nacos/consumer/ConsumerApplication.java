package com.cc.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// 启用服务注册与发现
@EnableDiscoveryClient
// 启用feign
@EnableFeignClients
public class ConsumerApplication {

    // run
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
