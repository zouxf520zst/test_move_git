package com.bjpowernode.nacosdiscoveryconsumer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NacosDiscoveryConsumerApplicationTests {

    @Value("${spring.application.name}")
    private String name;
    @Test
    void contextLoads() {
    }
    @Test
    void test(){
        System.out.println(name);
    }
}
