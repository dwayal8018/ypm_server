package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.dto.OrdersDTO;
import com.bluetech.protech.mapstruct.MapstructImplNew;
import com.bluetech.protech.pojo.Orders;
import com.bluetech.protech.repository.OrdersRepository;
import com.bluetech.protech.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;

	@Autowired
	private MapstructImplNew mapstructImplNew;

	public List<OrdersDTO> createOrder(List<OrdersDTO> orderList) {
		List<Orders> ordersList = mapstructImplNew.ordersDTOsToOrders(orderList);

		ordersList = ordersRepository.saveAll(ordersList);
		return mapstructImplNew.ordersToOrdersDTOs(ordersList);
	}

	public List<OrdersDTO> getAllOrders() {
		return mapstructImplNew.ordersToOrdersDTOs(ordersRepository.findAll());
	}

	public Optional<OrdersDTO> getOrderById(Integer id) {
		return ordersRepository.findById(id).map(mapstructImplNew::ordersToOrdersDTO);
	}

	public void deleteOrder(Integer id) {
		ordersRepository.deleteById(id);
	}
}
