package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by admin on 2017/4/13.
 */
@SpringBootConfiguration
@EnableDiscoveryClient
@RestController
@EnableAutoConfiguration
public class EurekaApplication {
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/")
    public String test() {
        return restTemplate.getForObject("http://ribbon-eureka-app/testRibbonEureka", String.class);
    }

    @RequestMapping("/testRibbonEureka")
    public String testRibbonEureka() {
        return "testRibbonEureka1";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
