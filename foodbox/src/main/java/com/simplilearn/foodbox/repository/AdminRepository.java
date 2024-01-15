package com.simplilearn.foodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.foodbox.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, String>{

	Admin findByusername(String username);

}