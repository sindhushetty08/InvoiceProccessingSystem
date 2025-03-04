package com.invoice.invoiceprocessingsystem.service;

import com.invoice.invoiceprocessingsystem.model.Invoice;
import java.util.List;

public interface InvoiceService {
    Invoice createInvoice(Invoice invoice);
    List<Invoice> getAllInvoices();
    Invoice getInvoiceById(Long id);
    Invoice updateInvoice(Long id, Invoice invoice);
    void deleteInvoice(Long id);
}
