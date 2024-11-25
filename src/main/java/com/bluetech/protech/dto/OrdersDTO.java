package com.bluetech.protech.dto;

import java.util.Date;
import java.util.Set;

import com.bluetech.protech.pojo.CustomPCBuild;
import com.bluetech.protech.pojo.ServiceRequest;
import com.bluetech.protech.pojo.User;

public class OrdersDTO {

	private Integer orderID;

	private Date orderDate;

	private String orderStatus;

	private Double totalCost;

	private ServiceRequestDTO serviceRequest; // multiple orders for single servicerequest

	private CustomPCBuildDTO customPCBuild;

	private UserDTO client;

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public ServiceRequestDTO getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(ServiceRequestDTO serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

	public CustomPCBuildDTO getCustomPCBuild() {
		return customPCBuild;
	}

	public void setCustomPCBuild(CustomPCBuildDTO customPCBuild) {
		this.customPCBuild = customPCBuild;
	}

	public UserDTO getClient() {
		return client;
	}

	public void setClient(UserDTO client) {
		this.client = client;
	}
	
}
