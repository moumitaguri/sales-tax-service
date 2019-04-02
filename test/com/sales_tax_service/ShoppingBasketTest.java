package com.sales_tax_service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingBasketTest {
    @Test
    void shouldReturnReceiptOfShoppingBagContainingOneNonExemptProduct() {

        ShoppingBasket shoppingBasket = new ShoppingBasket();
        String productName = "music CD";
        Product product = new Product(productName, ProductType.NON_EXEMPT_PRODUCT, 14.99);
        shoppingBasket.addProduct(product);

        String expected = new StringBuilder()
                .append("1 music CD : 14.99\n")
                .append("Sales Taxes : 1.50\n")
                .append("Total : 16.49").toString();

        String actual = shoppingBasket.generateReceipt();
        assertEquals(expected, actual);
    }
}