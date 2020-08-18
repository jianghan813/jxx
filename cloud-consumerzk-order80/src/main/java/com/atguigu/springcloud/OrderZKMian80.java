package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jdx
 * @date 2020-08-18 22:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMian80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZKMian80.class,args);
    }
}
