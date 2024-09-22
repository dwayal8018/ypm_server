package com.bluetech.protech.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.pojo.ServiceRequest;
import com.bluetech.protech.repository.ServiceRequestRepository;
import com.bluetech.protech.service.ServiceRequestService;

@Service
public class ServiceRequestServiceImpl implements ServiceRequestService {

	 @Autowired
	    private ServiceRequestRepository serviceRequestRepository;

	    public List<ServiceRequest> createServiceRequest(List<ServiceRequest> serviceRequestList) {
	    	
	    	
	    	for(ServiceRequest serviceRequest: serviceRequestList) {
//	    		serviceRequest.getClient();
//	    		serviceRequest.getOrders();
	    		serviceRequest.setServiceReqDate(new Date());
	    	}
	    	
	    	return serviceRequestRepository.saveAll(serviceRequestList);
	    }

	    public List<ServiceRequest> getAllServiceRequests() {
	        return serviceRequestRepository.findAll();
	    }

	    public Optional<ServiceRequest> getServiceRequestById(Integer id) {
	        return serviceRequestRepository.findById(id);
	    }

	    public void deleteServiceRequest(Integer id) {
	        serviceRequestRepository.deleteById(id);
	    }
}
