package com.bluetech.protech.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.dto.DeliveryDTO;
import com.bluetech.protech.service.DeliveryService;

@RestController
@RequestMapping("/api/deliveries")
public class DeliveryController {

	  @Autowired
	    private DeliveryService deliveryService;

	    @PostMapping
	    public ResponseEntity<List<DeliveryDTO>> createDelivery(@RequestBody DeliveryDTO deliveryList) {
	        List<DeliveryDTO> createdDeliveries = deliveryService.createDelivery(Arrays.asList(deliveryList));
	        return new ResponseEntity<>(createdDeliveries, HttpStatus.CREATED);
	    }
	    @PostMapping
	    public ResponseEntity<List<DeliveryDTO>> createDeliveries(@RequestBody List<DeliveryDTO> deliveryList) {
	    	List<DeliveryDTO> createdDeliveries = deliveryService.createDelivery(deliveryList);
	    	return new ResponseEntity<>(createdDeliveries, HttpStatus.CREATED);
	    }

	    @GetMapping
	    public ResponseEntity<List<DeliveryDTO>> getAllDeliveries() {
	        List<DeliveryDTO> deliveries = deliveryService.getAllDeliveries();
	        return new ResponseEntity<>(deliveries, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<DeliveryDTO> getDeliveryById(@PathVariable Integer id) {
	        Optional<DeliveryDTO> delivery = deliveryService.getDeliveryById(id);
	        return delivery.map(deliveryDTO -> new ResponseEntity<>(deliveryDTO, HttpStatus.OK))
	                       .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteDelivery(@PathVariable Integer id) {
	        deliveryService.deleteDelivery(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
}
