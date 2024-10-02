package com.bluetech.protech.controller;

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

import com.bluetech.protech.dto.UserDTO;
import com.bluetech.protech.service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired 
	UserService userService;
	
	@GetMapping("")
	public List<UserDTO> getUsers(@RequestParam(name="search") String search) {
		return userService.getUsers(search);

	}
	@GetMapping("/exists/{username}")
	public Boolean getUserByName(@PathVariable(name="username") String username) {
		return userService.userExists(username);
		
	}

	@PostMapping
	public List<UserDTO> createUser(@RequestBody List<UserDTO> userList) {
		return userService.createUser(userList);
	}
	
	@PostMapping("/register")
	public List<UserDTO> registerUser(@RequestBody UserDTO user) {
		return userService.createUser(Arrays.asList(user));
	}

	@GetMapping("/{id}")
	public UserDTO getUser(@PathVariable Integer id) {
		return userService.getUser(id);
	}

	@PutMapping("/{id}")
	public UserDTO updateUser(@PathVariable Integer id, @RequestBody UserDTO userDTO) {
		return userService.updateUser(id, userDTO);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}
}
