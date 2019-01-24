package com.github.baifenghe.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bfh
 * @since 1.0.0
 */
@FeignClient(name = "discovery-provider", fallback = ConsumeService.EchoServiceFallback.class, configuration = ConsumeService.FeignConfiguration.class)
public interface ConsumeService {

    @RequestMapping("/provider/echo")
    String echo();


    class FeignConfiguration {
        @Bean
        public EchoServiceFallback echoServiceFallback() {
            return new EchoServiceFallback();
        }
    }

    class EchoServiceFallback implements ConsumeService {
        @Override
        public String echo() {
            return "echo fallback";
        }
    }

}
