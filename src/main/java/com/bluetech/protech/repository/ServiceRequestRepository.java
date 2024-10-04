package com.bluetech.protech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bluetech.protech.pojo.ServiceRequest;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Integer> {

	@Query(value="Select * from tb_mas_service_request serviceRequest join tb_mas_user user on user.userID = serviceRequest.ClientID where user.userID=:userID ", nativeQuery = true)
	List<ServiceRequest> findbyClientId(Integer userID);

	@Query(value="Select * from tb_mas_service_request serviceRequest join tb_mas_user user on user.userID = serviceRequest.TechExpertID where user.userID=:userID",nativeQuery = true)
	List<ServiceRequest> findbyTechExpertId(Integer userID);

}
