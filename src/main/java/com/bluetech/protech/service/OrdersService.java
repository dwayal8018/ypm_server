package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.pojo.Orders;

public interface OrdersService {

	List<Orders> createOrder(List<Orders> orderList);

	List<Orders> getAllOrders();

	Optional<Orders> getOrderById(Integer id);

	void deleteOrder(Integer id);

}
