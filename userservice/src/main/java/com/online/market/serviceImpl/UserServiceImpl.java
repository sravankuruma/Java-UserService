package com.online.market.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.market.repo.UserRepository;
import com.online.market.resource.User;
import com.online.market.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	public User getUserDetails(int userId) {
		
		return userRepository.findById(userId);
	}

	@Override
	public User create(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		 userRepository.deleteById(userId);
	}
	
	
}
