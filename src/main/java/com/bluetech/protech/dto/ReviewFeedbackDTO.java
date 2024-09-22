package com.bluetech.protech.dto;

public class ReviewFeedbackDTO {

	private Integer reviewID;

	private Integer reviewRating;

	private String feedback;

	private UserDTO techExpert;

	private UserDTO client;

	private ServiceRequestDTO serviceRequest;

	public Integer getReviewID() {
		return reviewID;
	}

	public void setReviewID(Integer reviewID) {
		this.reviewID = reviewID;
	}

	public Integer getReviewRating() {
		return reviewRating;
	}

	public void setReviewRating(Integer reviewRating) {
		this.reviewRating = reviewRating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public UserDTO getTechExpert() {
		return techExpert;
	}

	public void setTechExpert(UserDTO techExpert) {
		this.techExpert = techExpert;
	}

	public UserDTO getClient() {
		return client;
	}

	public void setClient(UserDTO client) {
		this.client = client;
	}

	public ServiceRequestDTO getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(ServiceRequestDTO serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

}
