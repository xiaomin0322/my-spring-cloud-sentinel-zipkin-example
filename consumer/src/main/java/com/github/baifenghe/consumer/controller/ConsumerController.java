package com.github.baifenghe.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author bfh
 * @since 2018/12/20
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("hello")
    public String hello() {
        return restTemplate.getForObject("http://service-provider/test/hello/", String.class);
    }
}
