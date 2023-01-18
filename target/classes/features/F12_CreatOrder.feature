@smoke
Feature: Create successful Order
  Scenario: create successful Order
    Given user go to login page
    And user login with valid email and password
    And user press on login button
    When user select category
    And  user clicking on selected product
    And  user click on shopping cart upper page
    And  user click on checkbox to agree terms
    And  user click on checkout button
    Then checkout page opend
