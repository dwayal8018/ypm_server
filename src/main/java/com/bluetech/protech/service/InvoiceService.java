package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.dto.InvoiceDTO;
import com.bluetech.protech.pojo.Invoice;

public interface InvoiceService {

	List<InvoiceDTO> createInvoice(List<InvoiceDTO> invoiceDTOList);

	List<InvoiceDTO> getAllInvoices();

	Optional<InvoiceDTO> getInvoiceById(Integer id);

	void deleteInvoice(Integer id);

}
