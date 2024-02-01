package com.boot.work.bootwork.repsitories;

import com.boot.work.bootwork.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
