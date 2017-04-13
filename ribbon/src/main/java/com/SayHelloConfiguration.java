package com;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * Created by admin on 2017/4/9.
 */
public class SayHelloConfiguration {
    @Autowired
    IClientConfig ribbonClientConfig;
//
//    @Bean
//    public IPing iPing(IClientConfig config){
//        return new PingUrl();
//    }
}
