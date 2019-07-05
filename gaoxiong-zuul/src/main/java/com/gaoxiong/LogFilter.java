package com.gaoxiong;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.context.annotation.Configuration;

/**
 * @author gaoxiong
 * @ClassName LogFilter
 * @Description 日志过滤器
 * @date 2019/7/5 16:38
 */
@Configuration
public class LogFilter extends ZuulFilter {
    @Override
    public String filterType () {
        return "pre";
    }

    @Override
    public int filterOrder () {
        return 0;
    }

    @Override
    public boolean shouldFilter () {
        return true;
    }

    @Override
    public Object run () throws ZuulException {
        //记录调用的日志
        System.out.println("调用经过了日志过滤器");
        return null;
    }
}
