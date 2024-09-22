package com.bluetech.protech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluetech.protech.pojo.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
