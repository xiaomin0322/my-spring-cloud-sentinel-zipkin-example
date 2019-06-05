package com.github.baifenghe.consumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.github.baifenghe.consumer.feign.ConsumeRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bfh
 * @since 1.0.0
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private ConsumeRemote consumeService;

    @RequestMapping("echo")
    @SentinelResource("echo")
    public String echo2() {
    	try {
    		String s = consumeService.echo();
    		return s;
    	}catch (Exception e) {
		   e.printStackTrace();
		   return e.getMessage();
		}
    }

}
