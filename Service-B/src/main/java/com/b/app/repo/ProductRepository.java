package com.b.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b.app.models.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
