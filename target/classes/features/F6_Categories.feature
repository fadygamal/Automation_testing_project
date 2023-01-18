@smoke
Feature: Logged user could select different Categories
  Scenario: Logged user could select different Categories
    Given user go to login page
    And user login with valid email and password
    And user press on login button
    When user select category
    Then  the selected category should be displayed