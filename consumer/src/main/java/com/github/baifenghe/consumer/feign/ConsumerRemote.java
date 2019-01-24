package com.github.baifenghe.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bfh
 * @since 1.0.0
 */
@FeignClient(name = "discovery-provider")
public interface ConsumerRemote {

    @RequestMapping("/provider/echo")
    String echo();
}
