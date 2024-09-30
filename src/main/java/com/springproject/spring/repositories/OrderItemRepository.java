package com.springproject.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
