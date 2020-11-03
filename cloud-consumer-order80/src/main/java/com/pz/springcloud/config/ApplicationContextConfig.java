package com.pz.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced  //用Ribbon负载均衡开启 查询ID需开启
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
