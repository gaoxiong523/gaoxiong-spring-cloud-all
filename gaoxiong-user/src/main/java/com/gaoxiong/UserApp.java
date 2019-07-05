package com.gaoxiong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gaoxiong
 * @ClassName UserApp
 * @Description TODO
 * @date 2019/7/5 13:48
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserApp {
    public static void main ( String[] args ) {
        SpringApplication.run(UserApp.class, args);
    }
}
