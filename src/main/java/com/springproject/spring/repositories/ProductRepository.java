package com.springproject.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
