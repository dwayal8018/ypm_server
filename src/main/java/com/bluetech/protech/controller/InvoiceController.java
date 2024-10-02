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

import com.bluetech.protech.dto.InvoiceDTO;
import com.bluetech.protech.service.InvoiceService;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

	 @Autowired
	    private InvoiceService invoiceService;

	    @PostMapping
	    public ResponseEntity<List<InvoiceDTO>> createInvoice(@RequestBody InvoiceDTO invoiceDTOList) {
	        List<InvoiceDTO> createdInvoices = invoiceService.createInvoice(Arrays.asList(invoiceDTOList));
	        return new ResponseEntity<>(createdInvoices, HttpStatus.CREATED);
	    }
	    @PostMapping
	    public ResponseEntity<List<InvoiceDTO>> createInvoices(@RequestBody List<InvoiceDTO> invoiceDTOList) {
	    	List<InvoiceDTO> createdInvoices = invoiceService.createInvoice(invoiceDTOList);
	    	return new ResponseEntity<>(createdInvoices, HttpStatus.CREATED);
	    }

	    @GetMapping
	    public ResponseEntity<List<InvoiceDTO>> getAllInvoices() {
	        List<InvoiceDTO> invoices = invoiceService.getAllInvoices();
	        return new ResponseEntity<>(invoices, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<InvoiceDTO> getInvoiceById(@PathVariable Integer id) {
	        Optional<InvoiceDTO> invoice = invoiceService.getInvoiceById(id);
	        return invoice.map(invoiceDTO -> new ResponseEntity<>(invoiceDTO, HttpStatus.OK))
	                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteInvoice(@PathVariable Integer id) {
	        invoiceService.deleteInvoice(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
}
