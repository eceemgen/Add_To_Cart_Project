Feature: Adding product to cart
  As a user
  I want to add products to my cart
  So that I can purchase them later

  Scenario: I can add product on cart
    Given I am on the product page
    When I click on the "Add to Cart" button
    Then the product should be added to my cart
    And the cart should display the correct total price

