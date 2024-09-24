package com.springproject.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
