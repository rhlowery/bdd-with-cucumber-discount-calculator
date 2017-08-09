package com.ernesttech.example.bdd.discounts;

import java.math.BigDecimal;

public class PolicyDiscountCalculator {

    public void calculate(Policy policy) {

        if (policy.getTotal().doubleValue() >= 15.01) {

            policy.setDiscount(BigDecimal.valueOf(10));

        }

    }

}
