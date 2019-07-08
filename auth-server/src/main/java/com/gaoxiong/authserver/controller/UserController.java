package com.gaoxiong.authserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author gaoxiong
 * @ClassName UserController
 * @Description TODO
 * @date 2019/7/8 11:27
 */
@RestController
public class UserController {

    @GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }
}
