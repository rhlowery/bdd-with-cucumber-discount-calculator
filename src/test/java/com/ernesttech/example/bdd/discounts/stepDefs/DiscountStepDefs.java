package com.ernesttech.example.bdd.discounts.stepDefs;

import com.ernesttech.example.bdd.discounts.PolicyDiscountCalculator;
import com.ernesttech.example.bdd.discounts.Policy;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DiscountStepDefs {

    private Policy policy;

    private PolicyDiscountCalculator policyDiscountCalculator;


    @Before
    public void setUp() {
        policyDiscountCalculator = new PolicyDiscountCalculator();
    }

    @After
    public void tearDown() {
        // Any tear-down happens here
    }

    @Given("^a new policy for \"([^\"]*)\" dollars$")
    public void aNewPolicyForDollars(String orderPrice) throws Throwable {
        policy = new Policy();
        policy.setTotal(new BigDecimal(orderPrice));
    }

    @When("^I calculate the discount for the policy$")
    public void iCalculateTheDiscountForThePolicy() throws Throwable {
        policyDiscountCalculator.calculate(policy);
    }

    @Then("^I should get a \"([^\"]*)\" percent discount$")
    public void iShouldGetAPercentDiscount(String discount) throws Throwable {

        assertThat(policy.getDiscount(), is(new BigDecimal(discount)));

    }

}
