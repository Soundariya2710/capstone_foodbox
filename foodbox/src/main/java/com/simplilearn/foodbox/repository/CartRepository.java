package com.simplilearn.foodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.foodbox.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}