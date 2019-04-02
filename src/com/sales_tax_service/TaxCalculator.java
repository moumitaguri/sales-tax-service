package com.sales_tax_service;

public interface TaxCalculator {

    double calculateBasicSalesTax(double price);
    double calculateAdditionalSalesTax(double price,boolean isImported);
}
