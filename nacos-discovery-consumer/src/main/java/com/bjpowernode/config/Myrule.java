package com.bjpowernode.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:zouxf
 * @date 2022/12/13 16:07
 */
@Configuration
public class Myrule {
    @Bean
    public IRule rule(){
        return new RandomRule();
    }
}
