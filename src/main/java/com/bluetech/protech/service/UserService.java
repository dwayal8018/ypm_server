package com.bluetech.protech.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bluetech.protech.dto.UserDTO;
import com.bluetech.protech.pojo.User;

public interface UserService {

	List<UserDTO> createUser(List<UserDTO> userList);

//	User getUser(Long id);

	UserDTO updateUser(Integer id, UserDTO userDTO);

	void deleteUser(Integer id);

	UserDTO getUser(Integer id);

	List<UserDTO> getUsers(String search);

	Boolean userExists(String username);

	ResponseEntity<?> findByUserNameAndPassword(String username, String password);

//	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
