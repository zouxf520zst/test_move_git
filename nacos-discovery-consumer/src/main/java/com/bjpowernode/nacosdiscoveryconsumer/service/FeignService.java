package com.bjpowernode.nacosdiscoveryconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author:zouxf
 * @date 2022/12/8 17:24
 */
@Component
@FeignClient(value = "nacos-discovery-provider")
public interface FeignService {

    @GetMapping("/echo/{app}")
    public String echo(@PathVariable("app") String string);

    default String divide(Integer a) {
        System.out.println("consumer devide method......");
        return "212";
    }

    @GetMapping("testCache/{app}")
    public String testCache(@PathVariable("app") String app);
}
