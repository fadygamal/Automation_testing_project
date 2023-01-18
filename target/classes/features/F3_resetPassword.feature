@smoke
Feature: User reset his/her password successfully
  Scenario: reset password
    Given user go to login page
    When  click on forget password
    And   user put email
    And   user press recover button
    Then  confirmation message appears