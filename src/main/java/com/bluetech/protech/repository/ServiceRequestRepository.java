package com.bluetech.protech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluetech.protech.pojo.ServiceRequest;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Integer> {

}
