package com.cc.nacos.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/")
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("index")
    public String indexPage() {
        log.info("\nConsumerController -> indexPage: ");
        String pageStr = restTemplate.getForObject("http://nacos-discovery/index", String.class);
        return pageStr;
    }
}
