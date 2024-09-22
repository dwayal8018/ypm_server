package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.pojo.Payment;
import com.bluetech.protech.repository.PaymentsRepository;
import com.bluetech.protech.service.PaymentsService;

@Service
public class PaymentsServiceImpl implements PaymentsService {

	 @Autowired
	    private PaymentsRepository paymentsRepository;

	    public List<Payment> createPayment(List<Payment> paymentList) {
	        return paymentsRepository.saveAll(paymentList);
	    }

	    public List<Payment> getAllPayments() {
	        return paymentsRepository.findAll();
	    }

	    public Optional<Payment> getPaymentById(Integer id) {
	        return paymentsRepository.findById(id);
	    }

	    public void deletePayment(Integer id) {
	        paymentsRepository.deleteById(id);
	    }
	    
}
