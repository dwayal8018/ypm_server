package com.bluetech.protech.service;

import java.util.List;

import com.bluetech.protech.pojo.User;

public interface UserService  {

	List<User> createUser(List<User> userList);

//	User getUser(Long id);

	User updateUser(Integer id, User user);

	void deleteUser(Integer id);

	User getUser(Integer id);

	List<User> getUsers(String search);

	Boolean userExists(String username);

//	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;


}
