package com.cc.nacos.consumer.controller;

import com.cc.nacos.api.common.DataResult;
import com.cc.nacos.consumer.feignclient.IndexFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Resource
    private IndexFeignClient indexFeignClient;

    @GetMapping("index")
    public DataResult indexPage() {
        log.info("\nConsumerController -> indexPage: ");
        // rest调用
        //DataResult dataResult = restTemplate.getForObject("http://nacos-discovery/index", DataResult.class);
        // feign调用
        DataResult dataResult = indexFeignClient.indexInfo();
        return dataResult;
    }
}
