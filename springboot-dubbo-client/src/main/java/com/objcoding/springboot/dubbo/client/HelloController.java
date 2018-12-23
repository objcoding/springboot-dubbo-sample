package com.objcoding.springboot.dubbo.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.objcoding.springboot.dubbo.facade.HelloFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangchenghui.dev@gmail.com
 * @since 2018/11/22
 */
@RestController
public class HelloController {

    @Reference(version = "1.0.0")
    private HelloFacade helloFacade;

    @GetMapping("sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return helloFacade.sayHello(name);
    }
}
