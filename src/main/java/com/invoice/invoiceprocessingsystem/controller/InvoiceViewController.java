package com.invoice.invoiceprocessingsystem.controller;

import com.invoice.invoiceprocessingsystem.model.Invoice;
import com.invoice.invoiceprocessingsystem.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/invoices")
public class InvoiceViewController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping
    public String showInvoices(Model model) {
        model.addAttribute("invoices", invoiceService.getAllInvoices());
        return "invoice-list"; // Ensure invoice-list.html exists
    }

    @GetMapping("/add")
    public String showAddInvoiceForm(Model model) {
        model.addAttribute("invoice", new Invoice());
        return "add-invoice"; // Ensure add-invoice.html exists
    }

    @PostMapping("/save")
    public String saveInvoice(@ModelAttribute("invoice") Invoice invoice) {
        invoiceService.createInvoice(invoice);
        return "redirect:/invoices";
    }
}
