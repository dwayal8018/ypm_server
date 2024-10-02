package com.bluetech.protech.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.dto.PaymentDTO;
import com.bluetech.protech.service.PaymentsService;

@RestController
@RequestMapping("/api/payments")
public class PaymentsController {

	@Autowired
	private PaymentsService paymentsService;

	@PostMapping
	public ResponseEntity<List<PaymentDTO>> createPayment(@RequestBody PaymentDTO paymentDTOList) {
		List<PaymentDTO> createdPayments = paymentsService.createPayment(Arrays.asList(paymentDTOList));
		return new ResponseEntity<>(createdPayments, HttpStatus.CREATED);
	}
//
//	@PostMapping
//	public ResponseEntity<List<PaymentDTO>> createPayments(@RequestBody List<PaymentDTO> paymentDTOList) {
//		List<PaymentDTO> createdPayments = paymentsService.createPayment(paymentDTOList);
//		return new ResponseEntity<>(createdPayments, HttpStatus.CREATED);
//	}

	@GetMapping
	public ResponseEntity<List<PaymentDTO>> getAllPayments() {
		List<PaymentDTO> payments = paymentsService.getAllPayments();
		return new ResponseEntity<>(payments, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<PaymentDTO> getPaymentById(@PathVariable Integer id) {
		Optional<PaymentDTO> payment = paymentsService.getPaymentById(id);
		return payment.map(paymentDTO -> new ResponseEntity<>(paymentDTO, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePayment(@PathVariable Integer id) {
		paymentsService.deletePayment(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
