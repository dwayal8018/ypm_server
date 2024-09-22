package com.bluetech.protech.pojo; // Replace with your actual package name

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_mas_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

	@OneToMany(mappedBy = "client")
	private Set<ServiceRequest> serviceRequests;

	@OneToMany(mappedBy = "techExpert")
	private Set<ServiceRequest> techExpertServiceRequests;

	@OneToMany(mappedBy = "client")
	private Set<CustomPCBuild> customPCBuilds;

	@OneToMany(mappedBy = "deliveryPerson")
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
