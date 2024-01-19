package com.boot.work.bootwork;

import com.boot.work.bootwork.services.CategoryService;
import com.boot.work.bootwork.services.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BootWorkApplication
{



    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(BootWorkApplication.class, args);

        ProductService productService = container.getBean(ProductService.class);
        System.out.println(productService);
        productService.createProduct();
        CategoryService bean = container.getBean(CategoryService.class);
        System.out.println(bean);

        bean.getProductService().createProduct();

        bean.getCartService().addToCart();
    }

}
