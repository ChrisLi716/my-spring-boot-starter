package com.chris.service;

import com.chris.config.HelloWorldProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloWorldService {
    HelloWorldProperties helloWorldProperties;

    public String sayHello(String info) {
        return helloWorldProperties.getPrefix() + "-" + info + "-" + helloWorldProperties.getSuffix();
    }
}
