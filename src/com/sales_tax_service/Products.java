package com.sales_tax_service;

import java.util.ArrayList;
import java.util.List;

class Products {
    private List<Product> products;

    Products() {
        this.products = new ArrayList<>();
    }

    void add(Product product) {
        this.products.add(product);
    }

    double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : this.products) {
            totalCost += product.calculateCost();
        }
        return totalCost;
    }

    double calculateTotalSalesTaxes() {
        double totalSalesTaxes = 0;

        for (Product product : this.products) {
            totalSalesTaxes += product.calculateSalesTax();
        }
        return totalSalesTaxes;
    }

    StringBuilder generateProductDetails() {
        StringBuilder record = new StringBuilder();
        for (Product product : this.products) {
            record.append(product.generateProductDetail());
        }
        return record;

    }
}
