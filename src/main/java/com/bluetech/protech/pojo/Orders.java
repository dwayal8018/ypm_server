package com.bluetech.protech.pojo;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "tb_mas_orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderID")
	private Integer orderID;

	@Column(name = "OrderDate")
	@Temporal(TemporalType.DATE)
	private Date orderDate;

	@Column(name = "OrderStatus")
	private String orderStatus;

	@Column(name = "TotalCost")
	private Double totalCost;

	@ManyToOne // multiple orders for single servicerequest
	@JoinColumn(name = "ServiceID")
	private ServiceRequest serviceRequest;

	@ManyToOne
	@JoinColumn(name = "CustomPCID")
	private CustomPCBuild customPCBuild;

	
	@ManyToOne
	@JoinColumn(name = "ClientID")
	private User client;

//	@JsonIgnore
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
	private Set<Payment> payments;

//	@JsonIgnore
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
	private Set<Invoice> invoices;

//	@JsonIgnore
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
	private Set<Delivery> deliveries;

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

	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(ServiceRequest serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

	public CustomPCBuild getCustomPCBuild() {
		return customPCBuild;
	}

	public void setCustomPCBuild(CustomPCBuild customPCBuild) {
		this.customPCBuild = customPCBuild;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	public Set<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(Set<Invoice> invoices) {
		this.invoices = invoices;
	}

	public Set<Delivery> getDeliveries() {
		return deliveries;
	}

	public void setDeliveries(Set<Delivery> deliveries) {
		this.deliveries = deliveries;
	}

}
