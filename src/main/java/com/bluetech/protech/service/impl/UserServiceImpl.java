package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bluetech.protech.pojo.User;
import com.bluetech.protech.repository.UserRepository;
import com.bluetech.protech.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findbyUserName(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
//        return user;
//    }

	@Override
	public List<User> createUser(List<User> user) {
		return userRepository.saveAll(user);
	}

	@Override
	public User getUser(Integer id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public User updateUser(Integer id, User user) {
		if (userRepository.existsById(id)) {
			user.setUserID(id);
			return userRepository.save(user);
		}
		return null;
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

	@Override
	public List<User> getUsers(String search) {

		return userRepository.getUsers();
	}

	@Override
	public Boolean userExists(String username) {
		Optional<User> user = userRepository.findByUserName(username);
		if (user.isPresent())
			return true;
		return false;
	}
}
