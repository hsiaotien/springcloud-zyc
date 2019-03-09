package com.hxtcoder.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;

    @GetMapping("/from")
    public String from() {
        return this.from;
    }

    //======获取配置属性2

    @Autowired
    private Environment env;

    @GetMapping("/from2")
    public String from2() {
        return env.getProperty("from","undefined");
    }
}
