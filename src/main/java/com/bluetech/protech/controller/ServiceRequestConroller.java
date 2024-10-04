package com.bluetech.protech.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.dto.ServiceRequestDTO;
import com.bluetech.protech.service.ServiceRequestService;

@RestController
@RequestMapping("/api/service-requests")
public class ServiceRequestConroller {

	@Autowired
	private ServiceRequestService serviceRequestService;

	@PostMapping("/create-service")
	public ResponseEntity<List<ServiceRequestDTO>> createServiceRequest(@RequestBody ServiceRequestDTO serviceRequest) {
		List<ServiceRequestDTO> createdRequests = serviceRequestService
				.createServiceRequest(Arrays.asList(serviceRequest));
		return new ResponseEntity<>(createdRequests, HttpStatus.CREATED);
	}

	@PostMapping
	public ResponseEntity<List<ServiceRequestDTO>> createServiceRequests(
			@RequestBody List<ServiceRequestDTO> serviceRequestList) {
		List<ServiceRequestDTO> createdRequests = serviceRequestService.createServiceRequest(serviceRequestList);
		return new ResponseEntity<>(createdRequests, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<ServiceRequestDTO>> getAllServiceRequests(
			@RequestParam(name = "userRole") String userRole, @RequestParam(name = "userID") Integer userID) {
		List<ServiceRequestDTO> requests = serviceRequestService.getAllServiceRequests(userRole, userID);
		return new ResponseEntity<>(requests, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ServiceRequestDTO> getServiceRequestById(@PathVariable Integer id) {
		Optional<ServiceRequestDTO> request = serviceRequestService.getServiceRequestById(id);
		return request.map(serviceRequest -> new ResponseEntity<>(serviceRequest, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteServiceRequest(@PathVariable Integer id) {
		serviceRequestService.deleteServiceRequest(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
