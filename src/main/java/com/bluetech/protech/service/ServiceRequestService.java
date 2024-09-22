package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.pojo.ServiceRequest;

public interface ServiceRequestService {

	List<ServiceRequest> createServiceRequest(List<ServiceRequest> serviceRequestList);

	List<ServiceRequest> getAllServiceRequests();

	Optional<ServiceRequest> getServiceRequestById(Integer id);

	void deleteServiceRequest(Integer id);

}
