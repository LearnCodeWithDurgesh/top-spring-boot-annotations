package com.boot.work.bootwork.config;

import com.boot.work.bootwork.services.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public ProductService productService() {
        return new ProductService();
    }
}
