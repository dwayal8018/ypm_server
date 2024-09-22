package com.bluetech.protech.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.pojo.User;
import com.bluetech.protech.service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired 
	UserService userService;
	
	@GetMapping("")
	public List<User> getUsers(@RequestParam(name="search") String search) {
		return userService.getUsers(search);

	}
	@GetMapping("/exists/{username}")
	public Boolean getUserByName(@PathVariable(name="username") String username) {
		return userService.userExists(username);
		
	}

	@PostMapping
	public List<User> createUser(@RequestBody List<User> userList) {
		return userService.createUser(userList);
	}
	
	@PostMapping("/register")
	public List<User> registerUser(@RequestBody User user) {
		return userService.createUser(Arrays.asList(user));
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable Integer id) {
		return userService.getUser(id);
	}

	@PutMapping("/{id}")
	public User updateUser(@PathVariable Integer id, @RequestBody User user) {
		return userService.updateUser(id, user);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}
}
