package com.ernesttech.example.bdd.discounts;

import java.math.BigDecimal;

public class Policy {

    private BigDecimal total;
    private BigDecimal discount;

    public Policy() {
        this.total = BigDecimal.valueOf(0);
        this.discount = BigDecimal.valueOf(0);
    }

    public Policy(BigDecimal total, int tacoCount, boolean drinkIncluded) {
        this.total = total;
        this.discount = BigDecimal.valueOf(0);
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}

