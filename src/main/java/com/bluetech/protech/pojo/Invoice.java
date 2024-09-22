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
@Table(name = "tb_mas_invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "InvoiceID")
	private Integer invoiceID;

	@Column(name = "Quantity")
	private Integer quantity;

	@Column(name = "UnitPrice")
	private Double unitPrice;

	@Column(name = "TotalPrice")
	private Double totalPrice;

	@Column(name = "NetAmount")
	private Double netAmount;

	@Column(name = "TransactionID")
	private String transactionID;

	@ManyToOne
	@JoinColumn(name = "PaymentID") //multiple invoices could be generated for a single payment
	private Payment payment;

	@ManyToOne
	@JoinColumn(name = "OrderID")  //multiple invoices could be generated for a single orders
	private Orders order;

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

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

}
