package com.spring.vaidya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.vaidya.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}