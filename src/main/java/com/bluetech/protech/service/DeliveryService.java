package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.pojo.Delivery;

public interface DeliveryService {

	List<Delivery> createDelivery(List<Delivery> deliveryList);

	List<Delivery> getAllDeliveries();

	Optional<Delivery> getDeliveryById(Integer id);

	void deleteDelivery(Integer id);

	
}
