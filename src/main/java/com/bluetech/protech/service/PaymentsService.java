package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.dto.PaymentDTO;
import com.bluetech.protech.pojo.Payment;

public interface PaymentsService {

	List<PaymentDTO> createPayment(List<PaymentDTO> paymentDTOList);

	List<PaymentDTO> getAllPayments();

	Optional<PaymentDTO> getPaymentById(Integer id);

	void deletePayment(Integer id);

}
