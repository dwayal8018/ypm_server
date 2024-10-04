package com.bluetech.protech.pojo;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_mas_service_request")
public class ServiceRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ServiceID")
	private Integer serviceID;

	@Column(name = "ServiceReqDate")
	@Temporal(TemporalType.DATE)
	private Date serviceReqDate;

	@Column(name = "ServiceReqStatus")
	private String serviceReqStatus;

	@Column(name = "Type")
	private String type; // e.g., 'repair', 'installation'

	@Column(name = "Priority")
	private String priority; // e.g., 'low', 'medium', 'high'

	// many instances of the entity containing the annotation (i.e. ServiceRequest)
	// are associated with a
	// single instance of the target entity (i.e.client)
//	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "ClientID")
	private User client;

//	@JsonIgnore
//	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "TechExpertID")
	private User techExpert;

//	@JsonIgnore
	@OneToMany(mappedBy = "serviceRequest", fetch = FetchType.EAGER)
	private Set<ReviewFeedback> reviewFeedbacks;

//	@JsonIgnore
	@OneToMany(mappedBy = "serviceRequest", fetch = FetchType.EAGER)
	private Set<Orders> orders;

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

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public User getTechExpert() {
		return techExpert;
	}

	public void setTechExpert(User techExpert) {
		this.techExpert = techExpert;
	}

	public Set<ReviewFeedback> getReviewFeedbacks() {
		return reviewFeedbacks;
	}

	public void setReviewFeedbacks(Set<ReviewFeedback> reviewFeedbacks) {
		this.reviewFeedbacks = reviewFeedbacks;
	}

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}

}
