package com.pz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8400 {

    public static void main(String[] args) {

        SpringApplication.run(MainApp8400.class,args);
    }
}
