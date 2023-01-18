@smoke
Feature: F02_Login |User could log in with valid email and password

  Scenario: user could login with valid email and password
    Given user go to login page
    When user login with valid email and password
    And user press on login button
    Then user login to the system successfully