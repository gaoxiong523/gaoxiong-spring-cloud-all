package com.gaoxiong.dto;

import lombok.Data;

import java.util.Map;

/**
 * @author gaoxiong
 * @ClassName SmsSendRequest
 * @Description发送sms消息对象
 * @date 2019/7/5 10:25
 */
@Data
public class SmsSendRequest {
    /**
     * 短信模版ID
     */
    private String templateId;
    /**
     * 要发送的手机号
     */
    private String mobile;
    /**
     * 模版中携带的参数信息
     */
    private Map<String, Object> params;

}
