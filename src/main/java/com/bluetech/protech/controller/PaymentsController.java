package com.bluetech.protech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.pojo.Payment;
import com.bluetech.protech.service.PaymentsService;

@RestController
@RequestMapping("/api/payments")
public class PaymentsController {

	  @Autowired
	    private PaymentsService paymentsService;

	    @PostMapping
	    public List<Payment> createPayment(@RequestBody List<Payment> paymentList) {
	        return paymentsService.createPayment(paymentList);
	    }

	    @GetMapping
	    public List<Payment> getAllPayments() {
	        return paymentsService.getAllPayments();
	    }

	    @GetMapping("/{id}")
	    public Optional<Payment> getPaymentById(@PathVariable Integer id) {
	        return paymentsService.getPaymentById(id);
	    }

	    @DeleteMapping("/{id}")
	    public void deletePayment(@PathVariable Integer id) {
	        paymentsService.deletePayment(id);
	    }
}
