@wip
Feature:Buying hats for men
  Scenario:Buying hats for men from Amazon.com
    Given the user is on the Amazon page
    When the user searches for "hats for men"
    And the user selects first hat appearing
    And the user adds the hat to the Cart with quantity "2"
    And the user opens the cart
    Then as the quantity equals to 2 calculated price should be equal to the total price
    When the user changes the quantity from 2 to 1 in Cart
    Then as the quantity equals to 1 calculated price should be equal to the total price



