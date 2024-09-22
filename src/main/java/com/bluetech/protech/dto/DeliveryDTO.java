package com.bluetech.protech.dto;

public class DeliveryDTO {

	private Integer deliveryID;

	private String deliveryStatus;

	private String deliveryAddress; // Address to which the item is delivered

	private UserDTO client; // Reference to the client who made the order

	private UserDTO deliveryPerson; // Reference to the user handling the delivery

	private OrdersDTO order; // Reference to the related order

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

	public UserDTO getClient() {
		return client;
	}

	public void setClient(UserDTO client) {
		this.client = client;
	}

	public UserDTO getDeliveryPerson() {
		return deliveryPerson;
	}

	public void setDeliveryPerson(UserDTO deliveryPerson) {
		this.deliveryPerson = deliveryPerson;
	}

	public OrdersDTO getOrder() {
		return order;
	}

	public void setOrder(OrdersDTO order) {
		this.order = order;
	}

}
