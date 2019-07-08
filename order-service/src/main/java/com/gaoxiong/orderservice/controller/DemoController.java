package com.gaoxiong.orderservice.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoxiong
 * @ClassName DemoController
 * @Description TODO
 * @date 2019/7/8 15:52
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    @PreAuthorize("hasAuthority('query-demo')")
    public String getDemo(){
        return "good";
    }
}
