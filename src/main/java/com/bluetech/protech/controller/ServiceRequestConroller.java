package com.bluetech.protech.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.pojo.ServiceRequest;
import com.bluetech.protech.service.ServiceRequestService;

@RestController
@RequestMapping("/api/service-requests")
public class ServiceRequestConroller {


    @Autowired
    private ServiceRequestService serviceRequestService;

    @PostMapping("/create-service")
    public List<ServiceRequest> createServiceRequest(@RequestBody ServiceRequest serviceRequestList) {
        return serviceRequestService.createServiceRequest(Arrays.asList(serviceRequestList));
    }
    @PostMapping
    public List<ServiceRequest> createServiceRequests(@RequestBody List<ServiceRequest> serviceRequestList) {
    	return serviceRequestService.createServiceRequest(serviceRequestList);
    }

    @GetMapping
    public List<ServiceRequest> getAllServiceRequests() {
        return serviceRequestService.getAllServiceRequests();
    }

    @GetMapping("/{id}")
    public Optional<ServiceRequest> getServiceRequestById(@PathVariable Integer id) {
        return serviceRequestService.getServiceRequestById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteServiceRequest(@PathVariable Integer id) {
        serviceRequestService.deleteServiceRequest(id);
    }
}
