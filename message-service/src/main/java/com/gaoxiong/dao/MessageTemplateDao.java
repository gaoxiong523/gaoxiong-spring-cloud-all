package com.gaoxiong.dao;

import com.gaoxiong.entity.MessageTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author gaoxiong
 * @ClassName MessageTemplateDao
 * @Description TODO
 * @date 2019/7/5 10:27
 */
@Repository
public class MessageTemplateDao {

    public MessageTemplate get( String id) {
        //改成从数据库中读取模版信息
        MessageTemplate template = new MessageTemplate();
        template.setId(id);
        template.setName("注册验证码通知短信");
        template.setContent("验证码${code}，请在页面输入此验证码并完成手机验证。XXX公司");
        return template;
    }

}
