package com.bluetech.protech.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_mas_reviewFeedback")
public class ReviewFeedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ReviewID")
	private Integer reviewID;

	@Column(name = "ReviewRating")
	private Integer reviewRating;

	@Column(name = "Feedback")
	private String feedback;

	@ManyToOne
	@JoinColumn(name = "TechExpertID")
	private User techExpert;

	@ManyToOne
	@JoinColumn(name = "ClientID")
	private User client;

	@ManyToOne
	@JoinColumn(name = "ServiceID")
	private ServiceRequest serviceRequest;

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

	public User getTechExpert() {
		return techExpert;
	}

	public void setTechExpert(User techExpert) {
		this.techExpert = techExpert;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(ServiceRequest serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

}
