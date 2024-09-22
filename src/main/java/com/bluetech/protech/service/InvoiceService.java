package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.pojo.Invoice;

public interface InvoiceService {

	List<Invoice> createInvoice(List<Invoice> invoiceList);

	List<Invoice> getAllInvoices();

	Optional<Invoice> getInvoiceById(Integer id);

	void deleteInvoice(Integer id);

}
