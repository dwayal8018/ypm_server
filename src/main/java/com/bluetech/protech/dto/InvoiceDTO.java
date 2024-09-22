package com.bluetech.protech.dto;

public class InvoiceDTO {

	private Integer invoiceID;

	private Integer quantity;

	private Double unitPrice;

	private Double totalPrice;

	private Double netAmount;

	private String transactionID;

	private PaymentDTO payment;

	private OrdersDTO order;

	public Integer getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(Integer invoiceID) {
		this.invoiceID = invoiceID;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Double getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(Double netAmount) {
		this.netAmount = netAmount;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public PaymentDTO getPayment() {
		return payment;
	}

	public void setPayment(PaymentDTO payment) {
		this.payment = payment;
	}

	public OrdersDTO getOrder() {
		return order;
	}

	public void setOrder(OrdersDTO order) {
		this.order = order;
	}

}
