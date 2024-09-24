package com.springproject.spring.repositories.copy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
