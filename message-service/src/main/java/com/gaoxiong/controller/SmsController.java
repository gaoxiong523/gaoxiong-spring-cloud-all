package com.gaoxiong.controller;

import com.gaoxiong.dto.SmsSendRequest;
import com.gaoxiong.dto.SmsSendResponse;
import com.gaoxiong.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("message/sms")
public class SmsController {
    @Autowired
    private SmsService smsService;

    @GetMapping("/hello")
    public String get(){
        return "hello";
    }

    /**
     * 表单提交
     * @param request
     * @return
     */
@PostMapping("/send")
public ResponseEntity<SmsSendResponse> send ( SmsSendRequest request ) {
        SmsSendResponse response = smsService.send(request);
        return ResponseEntity.ok(response);
    }

    /**
     * JSON字符串提交 两种方式的区别在于,浏览器的content-type application/json
     * @param request
     * @return
     */
    @PostMapping("/send2")
    public ResponseEntity<SmsSendResponse> send2 ( @RequestBody SmsSendRequest request ) {
        SmsSendResponse response = smsService.send(request);
        return ResponseEntity.ok(response);
    }
}

