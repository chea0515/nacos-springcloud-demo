package com.cc.nacos.discovery.controller;

import com.cc.nacos.api.common.DataResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Slf4j
@RestController
@RequestMapping("/")
@RefreshScope
public class DiscoveryController {

    @Value("${test.config.user.name:}")
    private String userName;

    @GetMapping("index")
    public DataResult indexPage() {
        log.info("\nDiscoveryController -> indexPage: ");
        return DataResult.resultSuccess(
                new HashMap<String, Object>() {{
                    put("userName", userName);
                }}
        );
    }
}
