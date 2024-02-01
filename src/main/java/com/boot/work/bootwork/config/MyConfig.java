package com.boot.work.bootwork.config;

import com.boot.work.bootwork.services.ProductService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, JdbcTemplateAutoConfiguration.class})
public class MyConfig {

    @Bean
    public ProductService productService() {
        return new ProductService();
    }
}
