@smoke
Feature: User select different tags in product page
  Scenario: select different tags in categorise page
    Given user go to login page
    And user login with valid email and password
    And user press on login button
    When user select category
    And  user click on tag
    Then check tag assertion
