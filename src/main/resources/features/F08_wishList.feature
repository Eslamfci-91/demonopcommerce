@smoke
Feature: user could add products to wishlist

  Scenario: success message is visible after adding product to wishlist
    When user add product to wishlist
    Then wishlist notification success is visible

    Scenario: number of wishlist in homepage is increased
      When user add product to wishlist
      Then wishlist notification success is visible
      And user get the number of wishlist after adding product
      Then number of wishlist items increased