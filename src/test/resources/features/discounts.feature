Feature: Insurance Discounts

  For the insurance shopper
  Who thinks that loyalty has its rewards
  The Insurance Discount Program
  Is a loyalty program that rewards frequent patrons
  Unlike our competitor's program
  Our program gives you rewards today for bigger policies


  Scenario: policy premium of 15 dollars and under gets 0 discount
    Given a new policy for "15.00" dollars
    When I calculate the discount for the policy
    Then I should get a "0" percent discount

  Scenario: purchase of 15.01 dollars and over gets 10 discount
    Given a new policy for "15.01" dollars
    When I calculate the discount for the policy
    Then I should get a "10" percent discount
