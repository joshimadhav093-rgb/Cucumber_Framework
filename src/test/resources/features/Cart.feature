@Smoke
Feature:Validated Cart Functinality
  Background:
    Given Browser is open
    And Standard user is on login page
    Then User Enter standard_user and secret_sauce
    When click on login button
    Then user land on home page

  Scenario: Verify that when user click on add to cart button item is added in cart
    When user clicks on add to cart
    Then user click on cart symbol
    Then item should added in cart
    Then add item must be visible in cart section