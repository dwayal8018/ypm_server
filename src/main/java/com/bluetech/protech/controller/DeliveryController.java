package com.bluetech.protech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.pojo.Delivery;
import com.bluetech.protech.service.DeliveryService;

@RestController
@RequestMapping("/api/deliveries")
public class DeliveryController {

	  @Autowired
	    private DeliveryService deliveryService;

	    @PostMapping
	    public List<Delivery> createDelivery(@RequestBody List<Delivery> deliveryList) {
	        return deliveryService.createDelivery(deliveryList);
	    }

	    @GetMapping
	    public List<Delivery> getAllDeliveries() {
	        return deliveryService.getAllDeliveries();
	    }

	    @GetMapping("/{id}")
	    public Optional<Delivery> getDeliveryById(@PathVariable Integer id) {
	        return deliveryService.getDeliveryById(id);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteDelivery(@PathVariable Integer id) {
	        deliveryService.deleteDelivery(id);
	    }
}
