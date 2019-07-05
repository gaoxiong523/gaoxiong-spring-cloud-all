package com.gaoxiong.feignservice;

import com.gaoxiong.dto.SmsSendRequest;
import com.gaoxiong.dto.SmsSendResponse;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author gaoxiong
 * @ClassName MessageFeignService
 * @Description TODO
 * @date 2019/7/5 13:55
 */
@FeignClient(value = "message-service",fallbackFactory =MessageFeignService.MessageFeignServiceFallbackFactory.class)
@Component
public interface MessageFeignService {

    @PostMapping("/send2")
    ResponseEntity<SmsSendResponse> send2 ( @RequestBody SmsSendRequest request );

    @Component
    class MessageFeignServiceFallbackFactory implements FallbackFactory<MessageFeignService> {

        @Override
        public MessageFeignService create ( Throwable throwable ) {
            return request -> {
                SmsSendResponse response = new SmsSendResponse();
                response.setCode(String.valueOf(HttpStatus.NOT_FOUND));
                response.setMessage("服务调用失败");
                return new ResponseEntity<>(response,HttpStatus.NOT_FOUND );
            };
        }
    }
}
