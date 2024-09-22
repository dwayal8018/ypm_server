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

import com.bluetech.protech.pojo.Orders;
import com.bluetech.protech.service.OrdersService;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {

	  @Autowired
	    private OrdersService ordersService;

	    @PostMapping
	    public List<Orders> createOrder(@RequestBody List<Orders> orderList) {
	        return ordersService.createOrder(orderList);
	    }

	    @GetMapping
	    public List<Orders> getAllOrders() {
	        return ordersService.getAllOrders();
	    }

	    @GetMapping("/{id}")
	    public Optional<Orders> getOrderById(@PathVariable Integer id) {
	        return ordersService.getOrderById(id);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteOrder(@PathVariable Integer id) {
	        ordersService.deleteOrder(id);
	    }
}
