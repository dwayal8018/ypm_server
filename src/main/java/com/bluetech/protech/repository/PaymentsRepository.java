package com.bluetech.protech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluetech.protech.pojo.Payment;

public interface PaymentsRepository extends JpaRepository<Payment, Integer> {

}
