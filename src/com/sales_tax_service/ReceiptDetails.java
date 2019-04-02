package com.sales_tax_service;

class ReceiptDetails {
    private final StringBuilder productDetails;
    private final double salesTaxes;
    private final double totalCost;

    ReceiptDetails(StringBuilder productDetails, double salesTaxes, double totalCost) {
        this.productDetails = productDetails;
        this.salesTaxes = salesTaxes;
        this.totalCost = totalCost;
    }

    String generateReceipt() {
        return String.format("%sSales Taxes : %.2f\nTotal : %.2f",
                String.valueOf(this.productDetails), salesTaxes, totalCost);
    }
}
