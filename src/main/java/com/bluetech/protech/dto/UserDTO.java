package com.bluetech.protech.dto;

import java.util.Set;

public class UserDTO {

	private Integer userID;

	private String username;

	private String password;

	private String email;

	private String phoneNumber;

	private String address;

	private String role; // e.g., 'client', 'tech expert', 'admin'

	private Set<ServiceRequestDTO> serviceRequests;

	private Set<ServiceRequestDTO> techExpertServiceRequests;

	private Set<CustomPCBuildDTO> customPCBuilds;

	private Set<DeliveryDTO> deliveries;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<ServiceRequestDTO> getServiceRequests() {
		return serviceRequests;
	}

	public void setServiceRequests(Set<ServiceRequestDTO> serviceRequests) {
		this.serviceRequests = serviceRequests;
	}

	public Set<ServiceRequestDTO> getTechExpertServiceRequests() {
		return techExpertServiceRequests;
	}

	public void setTechExpertServiceRequests(Set<ServiceRequestDTO> techExpertServiceRequests) {
		this.techExpertServiceRequests = techExpertServiceRequests;
	}

	public Set<CustomPCBuildDTO> getCustomPCBuilds() {
		return customPCBuilds;
	}

	public void setCustomPCBuilds(Set<CustomPCBuildDTO> customPCBuilds) {
		this.customPCBuilds = customPCBuilds;
	}

	public Set<DeliveryDTO> getDeliveries() {
		return deliveries;
	}

	public void setDeliveries(Set<DeliveryDTO> deliveries) {
		this.deliveries = deliveries;
	}

}
