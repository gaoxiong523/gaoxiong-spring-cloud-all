package com.gaoxiong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gaoxiong
 * @ClassName MessageServiceApp
 * @Description TODO
 * @date 2019/7/5 10:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MessageServiceApp {
    public static void main ( String[] args ) {
        SpringApplication.run(MessageServiceApp.class, args);
    }
}
