@smoke
Feature: F01_Register | User could register with valid data
  Scenario: User could register with valid data
    Given user go to register page
    When  user select gender type
    And user enter the user name
    And user enter date of birth
    And user enter email
    And user fills Password fields
    And user clicks on register button
    Then success message is displayed