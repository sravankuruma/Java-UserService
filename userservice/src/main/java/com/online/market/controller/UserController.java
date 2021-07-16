package com.online.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.market.resource.User;
import com.online.market.service.UserService;

@RestController
@CrossOrigin(origins="*")
public class UserController {
	
	@Autowired UserService userService;

	@GetMapping("/getUserDetails/{userId}")
	public ResponseEntity<User> getUserDetails(@PathVariable int userId){
		
		 return new ResponseEntity<>(userService.getUserDetails(userId),  HttpStatus.OK);
	}
	
	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User user){
		return new ResponseEntity<>(userService.create(user),  HttpStatus.OK);
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		return new ResponseEntity<>(userService.updateUser(user), HttpStatus.OK);
	}
	@DeleteMapping("/deleteUser/{userId}")
	public void deleteUser(@PathVariable int userId){
		userService.deleteUser(userId);
	}
 }
