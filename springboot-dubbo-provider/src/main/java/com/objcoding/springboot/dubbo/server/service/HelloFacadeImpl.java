package com.objcoding.springboot.dubbo.server.service;

import com.objcoding.springboot.dubbo.api.HelloFacade;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zhangchenghui.dev@gmail.com
 * @since 2018/11/22
 */
@Component
@Service(version = "1.0.0")
public class HelloFacadeImpl implements HelloFacade {
    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    public String sayHello(String name) {




        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
