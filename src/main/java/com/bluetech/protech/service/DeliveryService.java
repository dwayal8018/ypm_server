package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.dto.DeliveryDTO;
import com.bluetech.protech.pojo.Delivery;

public interface DeliveryService {

	List<DeliveryDTO> createDelivery(List<DeliveryDTO> deliveryList);

	List<DeliveryDTO> getAllDeliveries();

	Optional<DeliveryDTO> getDeliveryById(Integer id);

	void deleteDelivery(Integer id);

	
}
