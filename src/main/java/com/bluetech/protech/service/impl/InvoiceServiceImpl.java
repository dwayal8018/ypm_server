package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.pojo.Invoice;
import com.bluetech.protech.repository.InvoiceRepository;
import com.bluetech.protech.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	public List<Invoice> createInvoice(List<Invoice> invoiceList) {
		return invoiceRepository.saveAll(invoiceList);
	}

	public List<Invoice> getAllInvoices() {
		return invoiceRepository.findAll();
	}

	public Optional<Invoice> getInvoiceById(Integer id) {
		return invoiceRepository.findById(id);
	}

	public void deleteInvoice(Integer id) {
		invoiceRepository.deleteById(id);
	}
}
