package com.github.baifenghe.consumer.controller;

import com.github.baifenghe.consumer.feign.ConsumerRemote;
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
    private ConsumerRemote consumerRemote;

    @RequestMapping("echo")
    public String echo() {
        return consumerRemote.echo();
    }

}
