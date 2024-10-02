package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.dto.PaymentDTO;
import com.bluetech.protech.mapstruct.MapstructImplNew;
import com.bluetech.protech.pojo.Payment;
import com.bluetech.protech.repository.PaymentsRepository;
import com.bluetech.protech.service.PaymentsService;

@Service
public class PaymentsServiceImpl implements PaymentsService {

	@Autowired
	private PaymentsRepository paymentsRepository;

	@Autowired
	private MapstructImplNew mapstructImplNew;

	public List<PaymentDTO> createPayment(List<PaymentDTO> paymentDTOList) {

		List<Payment> paymentList = mapstructImplNew.paymentDTOsToPayments(paymentDTOList);
		paymentList = paymentsRepository.saveAll(paymentList);

		return mapstructImplNew.paymentsToPaymentDTOs(paymentList);
	}

	public List<PaymentDTO> getAllPayments() {
		return mapstructImplNew.paymentsToPaymentDTOs(paymentsRepository.findAll());
	}

	public Optional<PaymentDTO> getPaymentById(Integer id) {
		return paymentsRepository.findById(id).map(mapstructImplNew::paymentToPaymentDTO);
	}

	public void deletePayment(Integer id) {
		paymentsRepository.deleteById(id);
	}

}
