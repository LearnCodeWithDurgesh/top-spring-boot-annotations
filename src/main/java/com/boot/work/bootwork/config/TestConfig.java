package com.boot.work.bootwork.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "app.developer.name")
public class TestConfig {


    @Bean
    public TestBean testBean() {
        return new TestBean();
    }

}
