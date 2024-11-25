package com.bluetech.protech.dto;

import java.util.Date;

public class PaymentDTO {

	private Integer paymentID;

	private String paymentMethod;

	private String paymentStatus;

	private Date paymentDate;

	private OrdersDTO orderDTO;

	public Integer getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(Integer paymentID) {
		this.paymentID = paymentID;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public OrdersDTO getOrder() {
		return orderDTO;
	}

	public void setOrder(OrdersDTO order) {
		this.orderDTO = order;
	}


}
