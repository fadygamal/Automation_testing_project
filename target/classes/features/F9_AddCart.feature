@smoke
Feature: Logged user could add different products to Shopping cart
  Scenario: Logged user could add different products to Shopping cart
    Given user go to login page
    And user login with valid email and password
    And user press on login button
    When user select category
    And  user clicking on selected product
    Then the product added to cart