package com.sales_tax_service;

class ShoppingBasket {
    private Products products;

    ShoppingBasket() {
        this.products = new Products();
    }

    void addProduct(Product product) {
        this.products.add(product);
    }


    String generateReceipt() {
        StringBuilder productDetails = products.generateProductDetails();
        double totalCost = products.calculateTotalCost();
        double salesTaxes = products.calculateTotalSalesTaxes();
        System.out.println(salesTaxes);

        ReceiptDetails receipt = new ReceiptDetails(productDetails, salesTaxes, totalCost);
//        System.out.println("receipt.generateReceipt() = " + receipt.generateReceipt());
        return receipt.generateReceipt();

    }
}
