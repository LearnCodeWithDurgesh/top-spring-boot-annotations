package com.boot.work.bootwork.entities.listeners;

import jakarta.persistence.*;

public class ProductListener
{
    @PrePersist
    public void savedCallback(Object object){
        System.out.println("saved callback");
    }


//    @PrePersist
//    @PostPersist
//    @PreUpdate
//    @PostUpdate
//    @PreRemove
//    @PostRemove
}
