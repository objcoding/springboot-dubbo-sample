package com.objcoding.springboot.dubbo.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangchenghui.dev@gmail.com
 * @since 2018/11/22
 */
@RestController
public class HelloController {

    @Resource
    private TestService testService;

    @GetMapping("sayHello/{name}")
    public String sayHello(@PathVariable String name){
        return testService.sayHello(name);
    }
}
