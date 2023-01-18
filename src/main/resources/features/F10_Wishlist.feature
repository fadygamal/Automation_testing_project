@smoke
Feature: Logged user could add different products to Wishlist

  Scenario: Logged user could add different products to Wishlist
    Given user go to login page
    And user login with valid email and password
    And user press on login button
    When user select category
    And  user add product to wishlist
    Then product added to wishlist