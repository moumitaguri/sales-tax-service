package com.sales_tax_service;

import java.util.HashMap;
import java.util.Map;

public class TaxCalculatorFactory {

    private Map<ProductType, TaxCalculator> calculators;

    public TaxCalculatorFactory() {
        this.calculators = new HashMap<>();
        this.calculators.put(ProductType.NON_EXEMPT_PRODUCT, new NonExemptProductTaxCalculator());
        this.calculators.put(ProductType.EXEMPT_PRODUCT, new ExemptProductTaxCalculator());
    }

    TaxCalculator getCalculator(ProductType type) {
        return this.calculators.get(type);
    }
}
