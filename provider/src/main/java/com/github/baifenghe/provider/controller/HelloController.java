package com.github.baifenghe.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bfh
 * @since 1.0.0
 */
@RestController
@RequestMapping("test")
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        return "hello, nacos";
    }
}
