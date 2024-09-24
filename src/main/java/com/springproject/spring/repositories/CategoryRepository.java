package com.springproject.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
