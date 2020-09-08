package com.chris.config;

import com.chris.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloWorldProperties.class)
public class HelloworldServiceAutoConfiguration {
    @Autowired
    HelloWorldProperties helloWorldProperties;

    @Bean
    @ConditionalOnClass(HelloWorldProperties.class)
    public HelloWorldService helloWorldService() {
        HelloWorldService helloWorldService = new HelloWorldService();
        helloWorldService.setHelloWorldProperties(helloWorldProperties);
        return helloWorldService;
    }
}
