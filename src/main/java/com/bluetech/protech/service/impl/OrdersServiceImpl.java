package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.pojo.Orders;
import com.bluetech.protech.repository.OrdersRepository;
import com.bluetech.protech.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {

	   @Autowired
	    private OrdersRepository ordersRepository;

	    public List<Orders> createOrder(List<Orders> orderList) {
	        return ordersRepository.saveAll(orderList);
	    }

	    public List<Orders> getAllOrders() {
	        return ordersRepository.findAll();
	    }

	    public Optional<Orders> getOrderById(Integer id) {
	        return ordersRepository.findById(id);
	    }

	    public void deleteOrder(Integer id) {
	        ordersRepository.deleteById(id);
	    }
}
