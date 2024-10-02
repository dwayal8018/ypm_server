package com.bluetech.protech.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.dto.ServiceRequestDTO;
import com.bluetech.protech.dto.UserDTO;
import com.bluetech.protech.mapstruct.MapstructImplNew;
import com.bluetech.protech.pojo.ServiceRequest;
import com.bluetech.protech.pojo.User;
import com.bluetech.protech.repository.ServiceRequestRepository;
import com.bluetech.protech.repository.UserRepository;
import com.bluetech.protech.service.ServiceRequestService;

@Service
public class ServiceRequestServiceImpl implements ServiceRequestService {

	@Autowired
	private ServiceRequestRepository serviceRequestRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	MapstructImplNew mapstructImplNew;

	@Override
	public List<ServiceRequestDTO> createServiceRequest(List<ServiceRequestDTO> serviceRequestList) {
		List<ServiceRequest> serviceRequestEntityList = new ArrayList<>();
		for (ServiceRequestDTO serviceRequestDTO : serviceRequestList) {
			ServiceRequest serviceRequest = new ServiceRequest();

			serviceRequest.setServiceID(serviceRequestDTO.getServiceID());
			serviceRequest.setType(serviceRequestDTO.getType());
			serviceRequest.setServiceReqStatus(serviceRequestDTO.getServiceReqStatus());
			serviceRequest.setPriority(serviceRequestDTO.getPriority());
			serviceRequest.setClient(createUserFromDTO(serviceRequestDTO.getClient()));
			serviceRequest.setTechExpert(createUserFromDTO(serviceRequestDTO.getTechExpert()));
//	    		serviceRequest.setOrders();
			serviceRequest.setServiceReqDate(new Date());
			serviceRequestEntityList.add(serviceRequest);
		}
		serviceRequestEntityList = serviceRequestRepository.saveAll(serviceRequestEntityList);
		return mapstructImplNew.serviceRequestsToServiceRequestDTOs(serviceRequestEntityList);
	}

	private User createUserFromDTO(UserDTO userDTO) {
		if (userDTO == null) {
			return null; // Handle null cases as needed
		}
		User user = new User();
		user.setUserID(userDTO.getUserID());
		return user;
	}

	@Override
	public List<ServiceRequestDTO> getAllServiceRequests() {
		return serviceRequestRepository.findAll().stream().map(mapstructImplNew::serviceRequestToServiceRequestDTO)
				.collect(Collectors.toList());
	}

	@Override
	public Optional<ServiceRequestDTO> getServiceRequestById(Integer id) {
		return serviceRequestRepository.findById(id).map(mapstructImplNew::serviceRequestToServiceRequestDTO);
	}

	@Override
	public void deleteServiceRequest(Integer id) {
		serviceRequestRepository.deleteById(id);

	}
}
