package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.dto.InvoiceDTO;
import com.bluetech.protech.mapstruct.MapstructImplNew;
import com.bluetech.protech.pojo.Invoice;
import com.bluetech.protech.repository.InvoiceRepository;
import com.bluetech.protech.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	@Autowired
	private MapstructImplNew mapstructImplNew;

	public List<InvoiceDTO> createInvoice(List<InvoiceDTO> invoiceDTOList) {
		List<Invoice> invoiceList = mapstructImplNew.invoiceDTOsToInvoices(invoiceDTOList);

		invoiceList = invoiceRepository.saveAll(invoiceList);
		return mapstructImplNew.invoicesToInvoiceDTOs(invoiceList);
	}

	public List<InvoiceDTO> getAllInvoices() {
		return invoiceRepository.findAll().stream().map(mapstructImplNew::invoiceToInvoiceDTO)
				.collect(Collectors.toList());
	}

	public Optional<InvoiceDTO> getInvoiceById(Integer id) {
		return invoiceRepository.findById(id).map(mapstructImplNew::invoiceToInvoiceDTO);
	}

	public void deleteInvoice(Integer id) {
		invoiceRepository.deleteById(id);
	}
}
