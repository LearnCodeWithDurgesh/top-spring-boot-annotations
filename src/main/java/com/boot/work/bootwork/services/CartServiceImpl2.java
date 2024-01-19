package com.boot.work.bootwork.services;

import org.springframework.stereotype.Component;

@Component("cart2")
public class CartServiceImpl2 implements  CartService{
    @Override
    public void addToCart() {
        System.out.println("Adding to cart by cart service 2");
    }
}
