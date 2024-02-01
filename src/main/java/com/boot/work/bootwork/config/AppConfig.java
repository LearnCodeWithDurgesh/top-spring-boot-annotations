package com.boot.work.bootwork.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myconfig.properties")
@ComponentScan(basePackages = {"working"})
public class AppConfig {
}
