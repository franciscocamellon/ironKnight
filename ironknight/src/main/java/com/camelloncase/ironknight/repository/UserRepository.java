package com.camelloncase.ironknight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camelloncase.ironknight.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername (String username);
	
	User findByEmail(String email);

}

