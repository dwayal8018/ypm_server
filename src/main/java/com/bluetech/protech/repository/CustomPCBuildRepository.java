package com.bluetech.protech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bluetech.protech.pojo.CustomPCBuild;

public interface CustomPCBuildRepository extends JpaRepository<CustomPCBuild, Integer> {

	@Query(value = " Select * from tb_mas_custombuild build join tb_mas_user user on user.userID = build.ClientID where user.userID=:userID ", nativeQuery = true)
	List<CustomPCBuild> findbyClientId(Integer userID);

	@Query(value = " Select * from tb_mas_custombuild build join tb_mas_user user on user.userID = build.TechExpertID where user.userID=:userID ", nativeQuery = true)
	List<CustomPCBuild> findbyTechExpertId(Integer userID);

}
