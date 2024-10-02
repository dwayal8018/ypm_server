package com.bluetech.protech.pojo; // Replace with your actual package name

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_mas_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserID")
	private Integer userID;

	@Column(name = "Username", unique = true)
	private String username;

	@Column(name = "Password")
	private String password;

	@Column(name = "Email")
	private String email;

	@Column(name = "PhoneNumber")
	private String phoneNumber;

	@Column(name = "Address")
	private String address;

	@Column(name = "Role")
	private String role; // e.g., 'client', 'tech expert', 'admin','deliveryPerson'

	@JsonIgnore
	@OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
	private Set<ServiceRequest> serviceRequests;

//	@JsonIgnore
//	@JsonManagedReference
	@OneToMany(mappedBy = "techExpert",fetch = FetchType.LAZY)
	private Set<ServiceRequest> techExpertServiceRequests;

//	@JsonIgnore
	@OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
	private Set<CustomPCBuild> customPCBuilds;

//	@JsonIgnore
	@OneToMany(mappedBy = "deliveryPerson",fetch = FetchType.LAZY)
	private Set<Delivery> deliveries;

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
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

	public Set<ServiceRequest> getServiceRequests() {
		return serviceRequests;
	}

	public void setServiceRequests(Set<ServiceRequest> serviceRequests) {
		this.serviceRequests = serviceRequests;
	}

	public Set<ServiceRequest> getTechExpertServiceRequests() {
		return techExpertServiceRequests;
	}

	public void setTechExpertServiceRequests(Set<ServiceRequest> techExpertServiceRequests) {
		this.techExpertServiceRequests = techExpertServiceRequests;
	}

	public Set<CustomPCBuild> getCustomPCBuilds() {
		return customPCBuilds;
	}

	public void setCustomPCBuilds(Set<CustomPCBuild> customPCBuilds) {
		this.customPCBuilds = customPCBuilds;
	}

	public Set<Delivery> getDeliveries() {
		return deliveries;
	}

	public void setDeliveries(Set<Delivery> deliveries) {
		this.deliveries = deliveries;
	}

}
