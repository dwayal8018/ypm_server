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

	private ServiceRequest serviceRequest; // multiple orders for single servicerequest

	private CustomPCBuild customPCBuild;

	private User client;

	private Set<PaymentDTO> payments;

	private Set<InvoiceDTO> invoices;

	private Set<DeliveryDTO> deliveries;

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

	public Set<PaymentDTO> getPayments() {
		return payments;
	}

	public void setPayments(Set<PaymentDTO> payments) {
		this.payments = payments;
	}

	public Set<InvoiceDTO> getInvoices() {
		return invoices;
	}

	public void setInvoices(Set<InvoiceDTO> invoices) {
		this.invoices = invoices;
	}

	public Set<DeliveryDTO> getDeliveries() {
		return deliveries;
	}

	public void setDeliveries(Set<DeliveryDTO> deliveries) {
		this.deliveries = deliveries;
	}

}
