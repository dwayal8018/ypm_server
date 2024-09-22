package com.bluetech.protech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluetech.protech.pojo.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
