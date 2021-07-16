package com.online.market.service;

import org.springframework.stereotype.Component;

import com.online.market.resource.User;
@Component
public interface UserService {
 
	 User getUserDetails(int userId);

	 User create(User user);
	 
	 User updateUser(User user);

	void deleteUser(int userId);
}
