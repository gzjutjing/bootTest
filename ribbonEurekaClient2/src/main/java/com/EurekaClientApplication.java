package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/4/13.
 */
@SpringBootConfiguration
@EnableDiscoveryClient
@RestController
@EnableAutoConfiguration
public class EurekaClientApplication {

    @RequestMapping("/testRibbonEureka")
    public String testRibbonEureka() {
        return "testRibbonEureka2";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
