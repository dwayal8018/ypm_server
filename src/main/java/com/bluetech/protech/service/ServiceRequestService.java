package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.dto.ServiceRequestDTO;

public interface ServiceRequestService {

	List<ServiceRequestDTO> createServiceRequest(List<ServiceRequestDTO> list);

	List<ServiceRequestDTO> getAllServiceRequests(String userRole, Integer userID);

	Optional<ServiceRequestDTO> getServiceRequestById(Integer id);

	void deleteServiceRequest(Integer id);

}
