package com.camelloncase.ironknight.service;

import org.springframework.stereotype.Service;

import com.camelloncase.ironknight.dto.UserDto;
import com.camelloncase.ironknight.exception.UserAlreadyExistException;
import com.camelloncase.ironknight.model.User;

@Service
public interface UserService {
	
	User findByUsername(String username);
	
	User findByEmail(String email);
	
	User save(UserDto userDto) throws UserAlreadyExistException;

}