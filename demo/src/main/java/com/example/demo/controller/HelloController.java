package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoxiong
 * @ClassName HelloController
 * @Description TODO
 * @date 2019/7/5 11:20
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hello")
    public String hello () {
        return "hello";
    }
}
