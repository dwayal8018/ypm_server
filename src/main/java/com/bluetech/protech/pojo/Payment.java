package com.bluetech.protech.pojo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_mas_payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PaymentID")
	private Integer paymentID;

	@Column(name = "PaymentMethod")
	private String paymentMethod;

	@Column(name = "PaymentStatus")
	private String paymentStatus;

	@Column(name = "PaymentDate")
	@Temporal(TemporalType.DATE)
	private Date paymentDate;

	@ManyToOne //many payments for single order   ... i.e. same orderid can be in multiple rows of payment table
	@JoinColumn(name = "OrderID")
	private Orders order;

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

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	
}
