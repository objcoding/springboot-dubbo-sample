package com.objcoding.springboot.dubbo.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.objcoding.springboot.dubbo.server.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    @Reference(version = "1.0.0")
    private HelloService helloService;

    public String sayHello(String name){
        return helloService.sayHello(name);
    }
}
