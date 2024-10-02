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

import com.bluetech.protech.dto.OrdersDTO;
import com.bluetech.protech.service.OrdersService;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;

	@PostMapping
	public ResponseEntity<List<OrdersDTO>> createOrder(@RequestBody OrdersDTO OrdersDTOList) {
		List<OrdersDTO> createdOrders = ordersService.createOrder(Arrays.asList(OrdersDTOList));
		return new ResponseEntity<>(createdOrders, HttpStatus.CREATED);
	}

	@PostMapping
	public ResponseEntity<List<OrdersDTO>> createOrders(@RequestBody List<OrdersDTO> OrdersDTOList) {
		List<OrdersDTO> createdOrders = ordersService.createOrder(OrdersDTOList);
		return new ResponseEntity<>(createdOrders, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<OrdersDTO>> getAllOrders() {
		List<OrdersDTO> orders = ordersService.getAllOrders();
		return new ResponseEntity<>(orders, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<OrdersDTO> getOrderById(@PathVariable Integer id) {
		Optional<OrdersDTO> order = ordersService.getOrderById(id);
		return order.map(OrdersDTO -> new ResponseEntity<>(OrdersDTO, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteOrder(@PathVariable Integer id) {
		ordersService.deleteOrder(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
