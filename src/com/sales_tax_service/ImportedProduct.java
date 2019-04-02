package com.sales_tax_service;

public class ImportedProduct extends Product {
    private String productName;
    private ProductType type;
    private double price;
    private boolean isImported = true;

    ImportedProduct(String productName, ProductType type, double price) {
        super(productName, type, price);
//        this.isImported = true;
    }
}
