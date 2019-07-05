package com.gaoxiong.service.impl;

import com.gaoxiong.dao.MessageTemplateDao;
import com.gaoxiong.dto.SmsSendRequest;
import com.gaoxiong.dto.SmsSendResponse;
import com.gaoxiong.entity.MessageTemplate;
import com.gaoxiong.service.SmsService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.StringWriter;

@Slf4j
@Service
public class SmsServiceImpl implements SmsService {
    @Autowired
    private MessageTemplateDao messageTemplateDao;
//    @Autowired
//    private Configuration configuration;

    @Override
    @SneakyThrows
    public SmsSendResponse send ( SmsSendRequest request ) {
        MessageTemplate messageTemplate = messageTemplateDao.get(request.getTemplateId());//根据模版ID从数据库中加载模版明细
        String templateContent = messageTemplate.getContent();
//        Template template = new Template(request.getTemplateId(), new StringReader(templateContent), configuration);
        StringWriter out = new StringWriter();
//        template.process(request.getParams(), out);//模版内容+传递进来的参数=最终要发送的短信内容
        String content = out.toString();
        return doSend(request.getMobile(), content);//调用实际的短信网关服务，发送短信
    }

    //改成调用实际的短息网关发送消息
    private SmsSendResponse doSend ( String mobile, String content ) {
        SmsSendResponse response = new SmsSendResponse();
        response.setCode("200");
        response.setMessage("发送成功");
        log.info("发送完毕，手机号：{}，发送内容：{},状态码：{}", mobile, content, response.getCode());
        return response;
    }

}
