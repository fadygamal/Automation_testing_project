@smoke
Feature: Logged user could filter with color

  Scenario: Logged user could filter with color
    Given user go to login page
    And user login with valid email and password
    And user press on login button
    When  user hover Apparel and select on Shoes
    And the selected subcategory should be displayed
    Then  user filter by color