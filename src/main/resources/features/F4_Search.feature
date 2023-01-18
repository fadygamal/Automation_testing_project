@smoke
Feature:Logged User could search for any product

  Scenario: Logged User could search for any product
    Given user go to login page
    And user login with valid email and password
    And user press on login button
    When user write product in search box
    Then  user click search button

