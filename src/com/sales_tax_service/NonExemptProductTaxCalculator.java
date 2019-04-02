package com.sales_tax_service;

class NonExemptProductTaxCalculator implements TaxCalculator {

    private static final double ADDITIONAL_TAX_RATE = 0.05;
    private static final double BASIC_TAX_RATE = 0.10;


    @Override
    public double calculateBasicSalesTax(double price) {
        return price * BASIC_TAX_RATE;
    }

    @Override
    public double calculateAdditionalSalesTax(double price, boolean isImported) {
        System.out.println("isImported = " + isImported);
        if(isImported) {
            return price * ADDITIONAL_TAX_RATE;
        }
        return 0.0;
    }


}
