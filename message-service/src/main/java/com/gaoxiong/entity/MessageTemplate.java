package com.gaoxiong.entity;

import lombok.Data;

/**
 * @author gaoxiong
 * @ClassName MessageTemplate
 * @Description TODO
 * @date 2019/7/5 10:23
 */
@Data
public class MessageTemplate {
    /**
     * 模版ID
     */
    private String id;
    /**
     * 模版名称
     */
    private String name;
    /**
     * 模版内容
     */
    private String content;
}
