package com.gaoxiong.service;

import com.gaoxiong.dto.SmsSendRequest;
import com.gaoxiong.dto.SmsSendResponse;

/**
 * @author gaoxiong
 * @ClassName SmsService
 * @Description TODO
 * @date 2019/7/5 10:29
 */
public interface SmsService {
    SmsSendResponse send( SmsSendRequest request );
}
