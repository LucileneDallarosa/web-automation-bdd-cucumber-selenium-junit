Feature: Complete product purchase process

  Scenario: Buy Blue t-shirt on http://demo.cs-cart.com
    Given Access WebPage http://demo.cs-cart.com
     When Search for blue t-shirt
      And Access the product code 282 on the table grid
      And Add the product code 282 to the cart
      And Check the item T-shirt, Color: Blue on the cart and total price 27.99
      And Do the Checkout
      And Select the “Phone Order” Payment, address: 4190 Coffee Rd and e-mail: teste@teste.com
     Then Proceed with the order
      And Close WebPage

