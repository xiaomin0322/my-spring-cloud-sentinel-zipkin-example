package com.github.baifenghe.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bfh
 * @since 1.0.0
 */
@RestController
@RequestMapping("provider")
public class ProviderController {

    @RequestMapping("echo")
    public String echo() {
    	System.out.println("provider echo>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    	throw new RuntimeException();
        //return "hello nacos";
    }
}
