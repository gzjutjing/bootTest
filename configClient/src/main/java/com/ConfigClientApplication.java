package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/4/3.
 */
@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {
    @Value("${name}")
    private String remoteConfigName;
    @Value("${date}")
    private String remoteClientDate;


    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @RequestMapping("/configClientTest")
    public String configClientTest() {
        return remoteClientDate + " - " + remoteConfigName;
    }

}
