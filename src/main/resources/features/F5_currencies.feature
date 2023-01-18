@smoke
Feature: F03_Currency | users could change currency view

  Scenario: user could select euro currency
    Given user go to login page
    And user login with valid email and password
    And user press on login button
    When click on currency drop-list and choose Euro
    Then euro symbol is applied