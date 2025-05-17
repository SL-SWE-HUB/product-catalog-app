package com.example.product_catalog_backend.repository;

import com.example.product_catalog_backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryJPAInterface  extends JpaRepository<Product, Long> {
}
