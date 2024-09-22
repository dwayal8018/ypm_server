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

import com.bluetech.protech.pojo.Invoice;
import com.bluetech.protech.service.InvoiceService;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping
    public List<Invoice> createInvoice(@RequestBody List<Invoice> invoiceList) {
        return invoiceService.createInvoice(invoiceList);
    }

    @GetMapping
    public List<Invoice> getAllInvoices() {
        return invoiceService.getAllInvoices();
    }

    @GetMapping("/{id}")
    public Optional<Invoice> getInvoiceById(@PathVariable Integer id) {
        return invoiceService.getInvoiceById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteInvoice(@PathVariable Integer id) {
        invoiceService.deleteInvoice(id);
    }
}
