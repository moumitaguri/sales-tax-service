package com.sales_tax_service;

class Product {
    private String productName;
    private ProductType type;
    private double price;
    private boolean isImported;

    Product(String productName, ProductType type, double price) {
        this.productName = productName;
        this.type = type;
        this.price = price;
        this.isImported = false;
    }

    double calculateSalesTax() {
        double basicSalesTax = calculateBasicSalesTax();
        System.out.println("basicSalesTax = " + basicSalesTax);
        double additionalSalesTax = calculateAdditionalSalesTax();
        System.out.println("additionalSalesTax = " + additionalSalesTax);
        return basicSalesTax + additionalSalesTax;
    }

    double calculateCost() {
        double salesTax = calculateSalesTax();
        return this.price + salesTax;
    }

    private TaxCalculator getTaxCalculator() {
        return new TaxCalculatorFactory().getCalculator(this.type);
    }

    private double calculateBasicSalesTax() {
        return getTaxCalculator().calculateBasicSalesTax(this.price);
    }

    private double calculateAdditionalSalesTax() {
        return getTaxCalculator().calculateAdditionalSalesTax(this.price, this.isImported);
    }

    StringBuilder generateProductDetail() {
        return new StringBuilder()
                .append("1 ")
                .append(this.productName)
                .append(" : ")
                .append(this.price)
                .append("\n");
    }
}