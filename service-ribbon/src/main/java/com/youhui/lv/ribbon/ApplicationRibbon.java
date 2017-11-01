package com.youhui.lv.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *ribbon进行负载均衡
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class ApplicationRibbon {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRibbon.class,args);
    }
    @Bean
    @LoadBalanced //负载均衡策略
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
