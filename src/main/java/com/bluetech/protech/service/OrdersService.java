package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.dto.OrdersDTO;

public interface OrdersService {

	List<OrdersDTO> createOrder(List<OrdersDTO> ordersDTOList);

	List<OrdersDTO> getAllOrders();

	Optional<OrdersDTO> getOrderById(Integer id);

	void deleteOrder(Integer id);

}
