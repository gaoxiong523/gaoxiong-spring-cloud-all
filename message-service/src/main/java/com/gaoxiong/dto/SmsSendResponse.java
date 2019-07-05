package com.gaoxiong.dto;

import lombok.Data;

/**
 * @author gaoxiong
 * @ClassName SmsSendResponse
 * @Description 返回消息
 * @date 2019/7/5 10:26
 */
@Data
public class SmsSendResponse {
    /**
     * 返回消息
     */
    private String message;
    /**
     * 返回状态码
     */
    private String code;
}
