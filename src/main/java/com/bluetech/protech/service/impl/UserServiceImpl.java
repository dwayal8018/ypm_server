package com.bluetech.protech.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bluetech.protech.dto.UserDTO;
import com.bluetech.protech.mapstruct.MapstructImplNew;
import com.bluetech.protech.pojo.User;
import com.bluetech.protech.repository.UserRepository;
import com.bluetech.protech.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Autowired
	MapstructImplNew mapstruct;

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
	public List<UserDTO> createUser(List<UserDTO> userDTOList) {

		List<User> userList = userRepository.saveAll(mapstruct.userDTOsToUsers(userDTOList));

		return mapstruct.usersToUserDTOs(userList);

	}

	@Override
	public UserDTO getUser(Integer id) {
		return mapstruct.userToUserDTO(userRepository.findById(id).orElse(null));
	}

	@Override
	public UserDTO updateUser(Integer id, UserDTO userDTO) {
		if (userRepository.existsById(id)) {
			User user = mapstruct.userDTOToUser(userDTO); // Convert DTO to Entity
			user.setUserID(id);
			User updatedUser = userRepository.save(user);
			return mapstruct.userToUserDTO(updatedUser); // Convert back to DTO for return
		}
		return null; // or throw an exception
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

	@Override
	public List<UserDTO> getUsers(String search) {
		List<User> users = userRepository.fetchUser();
		return mapstruct.usersToUserDTOs(users);
	}

	@Override
	public Boolean userExists(String username) {
		Optional<User> user = userRepository.findByUserName(username);
		if (user.isPresent())
			return true;
		return false;
	}

	@Override
	public ResponseEntity<?> findByUserNameAndPassword(String username, String password) {
		User user = userRepository.findByUsernameAndPassword(username, password);

		UserDTO userDTO = mapstruct.userToUserDTO(user);
		if (user == null) {
			Map<String, String> map = Collections.singletonMap("error", "User not found");
			return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
		}
//		Map<String, String> map = Collections.singletonMap("userRole", user.getRole());
		return new ResponseEntity<>(userDTO, HttpStatus.OK);

	}
}
