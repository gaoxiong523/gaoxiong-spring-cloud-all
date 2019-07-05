package com.gaoxiong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author gaoxiong
 * @ClassName ZuulApp
 * @Description TODO
 * @date 2019/7/5 15:34
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulApp {
    public static void main ( String[] args ) {
        SpringApplication.run(ZuulApp.class, args);
    }
}
