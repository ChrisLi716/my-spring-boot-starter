package com.chris.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "helloworld.chris")
@Data
public class HelloWorldProperties {
    private String prefix;
    private String suffix;
}
