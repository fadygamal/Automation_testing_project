@smoke
Feature: Logged user could add different products to compare list

  Scenario:  Logged user could add different products to compare list
    Given user go to login page
    And user login with valid email and password
    And user press on login button
    When user select category
    And user add product to compare list
    Then product added to compare list