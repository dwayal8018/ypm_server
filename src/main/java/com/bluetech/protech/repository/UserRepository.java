package com.bluetech.protech.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bluetech.protech.pojo.User;

public interface UserRepository extends JpaRepository<User, Integer> {

//	@Query("Select user From User user")
//	User findbyUserName(String username);

	@Query("Select user From User user where username=:username")
	Optional<User> findByUserName(String username);

	@Query("Select user From User user")
	List<User> getUsers();

	@Query(value="Select * From tb_mas_user user",nativeQuery = true)
	List<User> fetchUser();

}
