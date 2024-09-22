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
@Table(name = "tb_mas_delivery")
public class Delivery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DeliveryID")
	private Integer deliveryID;

	@Column(name = "DeliveryStatus")
	private String deliveryStatus;

	@Column(name = "DeliveryAddress")
	private String deliveryAddress; // Address to which the item is delivered

	@ManyToOne
	@JoinColumn(name = "ClientID") //many deliveries for same client
	private User client; // Reference to the client who made the order

	@ManyToOne
	@JoinColumn(name = "DeliveryPersonID") //many deliveries for same deliveryPerson
	private User deliveryPerson; // Reference to the user handling the delivery

	@ManyToOne
	@JoinColumn(name = "OrderID") //many deliveries for same order
	private Orders order; // Reference to the related order

	public Integer getDeliveryID() {
		return deliveryID;
	}

	public void setDeliveryID(Integer deliveryID) {
		this.deliveryID = deliveryID;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public User getDeliveryPerson() {
		return deliveryPerson;
	}

	public void setDeliveryPerson(User deliveryPerson) {
		this.deliveryPerson = deliveryPerson;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	// Getters and Setters

}
