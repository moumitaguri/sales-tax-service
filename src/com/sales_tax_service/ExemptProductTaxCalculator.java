package com.sales_tax_service;

public class ExemptProductTaxCalculator implements TaxCalculator {
    private static final double ADDITIONAL_TAX_RATE = 0.05;

    @Override
    public double calculateBasicSalesTax(double price) {
        return price;
    }

    @Override
    public double calculateAdditionalSalesTax(double price, boolean isImported) {
        if (isImported) {
            return price * ADDITIONAL_TAX_RATE;
        }
        return price;
    }
}
