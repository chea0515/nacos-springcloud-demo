package com.cc.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ConfigApplication.class, args);
        ConfigurableEnvironment env = applicationContext.getEnvironment();
        String port = env.getProperty("server.port");
        String cxtPath = env.getProperty("server.servlet.context-path");
        System.out.println("--> port: " + port);
        System.out.println("--> context-path: " + cxtPath);
        // listen config change
        while(true) {
            String userName = env.getProperty("test.config.user.name");
            System.out.println(userName);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
