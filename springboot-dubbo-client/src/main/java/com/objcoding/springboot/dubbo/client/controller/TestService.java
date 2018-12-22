package com.objcoding.springboot.dubbo.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.objcoding.springboot.dubbo.api.HelloFacade;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    @Reference(version = "1.0.0")
    private HelloFacade helloFacade;

    public String sayHello(String name){
        return helloFacade.sayHello(name);
    }
}
