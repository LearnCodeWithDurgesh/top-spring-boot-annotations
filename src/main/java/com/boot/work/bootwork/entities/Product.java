package com.boot.work.bootwork.entities;


import com.boot.work.bootwork.entities.listeners.ProductListener;
import jakarta.persistence.*;

@Entity
@Table(name = "products")
@EntityListeners(value = ProductListener.class)
public class Product {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String name;

    private String shortDescription;
    private String longDescription;

    @Column(name = "product_price")
    private double price;

    private boolean isLive = false;

    @Transient
    private boolean inStock = true;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
