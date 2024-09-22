package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.pojo.Delivery;
import com.bluetech.protech.repository.DeliveryRepository;
import com.bluetech.protech.service.DeliveryService;

@Service
public class DeliveryServiceImpl implements DeliveryService {

	  @Autowired
	    private DeliveryRepository deliveryRepository;

	    public List<Delivery> createDelivery(List<Delivery> deliveryList) {
	        return deliveryRepository.saveAll(deliveryList);
	    }

	    public List<Delivery> getAllDeliveries() {
	        return deliveryRepository.findAll();
	    }

	    public Optional<Delivery> getDeliveryById(Integer id) {
	        return deliveryRepository.findById(id);
	    }

	    public void deleteDelivery(Integer id) {
	        deliveryRepository.deleteById(id);
	    }
}
