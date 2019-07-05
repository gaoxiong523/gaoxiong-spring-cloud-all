package com.gaoxiong.controller;

import com.gaoxiong.dto.SmsSendRequest;
import com.gaoxiong.dto.SmsSendResponse;
import com.gaoxiong.feignservice.MessageFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author gaoxiong
 * @ClassName UserController
 * @Description TODO
 * @date 2019/7/5 13:58
 */
@RestController
//@RequestMapping("/user")
public class UserController {
    @Autowired
    private MessageFeignService messageService;

    @RequestMapping(value= {"regist/sms2"})
    public ResponseEntity<SmsSendResponse> sms2(String mobile){
        Random random = new Random();
        int next = random.nextInt(10000000);
        String code = ""+(10000000-next);
        ResponseEntity<SmsSendResponse> response = doSendFeign(mobile, code);
        return response;
    }
    public ResponseEntity<SmsSendResponse> doSendFeign(String mobile,String code) {
        SmsSendRequest request = new SmsSendRequest();
        request.setMobile(mobile);
        request.setTemplateId("CHECK_CODE");
        Map<String, Object> params = new HashMap<>();
        params.put("code", code);
        request.setParams(params);
        return messageService.send2(request);
    }


}
