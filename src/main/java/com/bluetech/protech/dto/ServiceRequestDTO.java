package com.bluetech.protech.dto;

import java.util.Date;
import java.util.Set;

public class ServiceRequestDTO {

	
	private Integer serviceID;

	private Date serviceReqDate;

	private String serviceReqStatus;

	private String type; // e.g., 'repair', 'installation'

	private String priority; // e.g., 'low', 'medium', 'high'

	private UserDTO client;

	private UserDTO techExpert;

	private Set<ReviewFeedbackDTO> reviewFeedbacks;

	private Set<OrdersDTO> orders;

	public Integer getServiceID() {
		return serviceID;
	}

	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
	}

	public Date getServiceReqDate() {
		return serviceReqDate;
	}

	public void setServiceReqDate(Date serviceReqDate) {
		this.serviceReqDate = serviceReqDate;
	}

	public String getServiceReqStatus() {
		return serviceReqStatus;
	}

	public void setServiceReqStatus(String serviceReqStatus) {
		this.serviceReqStatus = serviceReqStatus;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public UserDTO getClient() {
		return client;
	}

	public void setClient(UserDTO client) {
		this.client = client;
	}

	public UserDTO getTechExpert() {
		return techExpert;
	}

	public void setTechExpert(UserDTO techExpert) {
		this.techExpert = techExpert;
	}

	public Set<ReviewFeedbackDTO> getReviewFeedbacks() {
		return reviewFeedbacks;
	}

	public void setReviewFeedbacks(Set<ReviewFeedbackDTO> reviewFeedbacks) {
		this.reviewFeedbacks = reviewFeedbacks;
	}

	public Set<OrdersDTO> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrdersDTO> orders) {
		this.orders = orders;
	}

}
