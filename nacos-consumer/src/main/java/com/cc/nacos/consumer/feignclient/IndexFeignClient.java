package com.cc.nacos.consumer.feignclient;

import com.cc.nacos.api.common.DataResult;
import com.cc.nacos.consumer.feignclient.impl.IndexFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "nacos-discovery", path = "/index", fallback = IndexFeignClientFallback.class)
public interface IndexFeignClient {

    @GetMapping("")
    DataResult indexInfo();
}
