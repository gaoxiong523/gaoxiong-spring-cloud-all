package com.gaoxong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author gaoxiong
 * @ClassName Oauth2App
 * @Description TODO
 * @date 2019/7/5 17:02
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableAuthorizationServer
public class Oauth2App {
    public static void main ( String[] args ) {
        SpringApplication.run(Oauth2App.class, args);
    }
}
