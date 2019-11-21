package com.risesin.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableHystrix
@EnableScheduling
@SpringCloudApplication
public class RisesinGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(RisesinGatewayApplication.class, args);
    }

}
