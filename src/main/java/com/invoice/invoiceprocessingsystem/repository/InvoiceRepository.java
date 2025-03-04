
package com.invoice.invoiceprocessingsystem.repository;

import com.invoice.invoiceprocessingsystem.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
