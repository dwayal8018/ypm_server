package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.pojo.Payment;

public interface PaymentsService {

	List<Payment> createPayment(List<Payment> paymentList);

	List<Payment> getAllPayments();

	Optional<Payment> getPaymentById(Integer id);

	void deletePayment(Integer id);

}
