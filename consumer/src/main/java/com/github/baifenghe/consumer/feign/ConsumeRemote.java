package com.github.baifenghe.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bfh
 * @since 1.0.0
 */
@FeignClient(name = "discovery-provider", fallback = ConsumeRemote.EchoServiceFallback.class, configuration = ConsumeRemote.FeignConfiguration.class)
public interface ConsumeRemote {

    @RequestMapping("/provider/echo")
    String echo();

    class FeignConfiguration {
        @Bean
        public EchoServiceFallback echoServiceFallback() {
            return new EchoServiceFallback();
        }
    }

    class EchoServiceFallback implements ConsumeRemote {
        @Override
        public String echo() {
            return "echo fallback";
        }
    }

}
