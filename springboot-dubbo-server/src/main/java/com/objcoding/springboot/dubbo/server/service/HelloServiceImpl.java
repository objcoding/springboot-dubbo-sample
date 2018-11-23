package com.objcoding.springboot.dubbo.server.service;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author zhangchenghui.dev@gmail.com
 * @since 2018/11/22
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello , "+name;
    }
}
