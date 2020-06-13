package com.cc.nacos.consumer.feignclient.impl;

import com.cc.nacos.api.common.DataResult;
import com.cc.nacos.consumer.feignclient.IndexFeignClient;
import org.springframework.stereotype.Component;

@Component
public class IndexFeignClientFallback implements IndexFeignClient {
    @Override
    public DataResult indexInfo() {
        return DataResult.resultError("[网络繁忙]请求首页数据失败");
    }
}
