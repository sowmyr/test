Feature: CartPageTest (Add a product to the Cart)

Scenario: Test to verify that the user is able to add a product to the Cart

When I enter a valid credentials
And I click on "SignIn" button
Then I am navigated to the HomePage
When I search for first product 
Then I am displayed with the corresponding search results
When I click on any of the product
Then I am navigated to the product details page
When I select a color and size combination
And click on "Add To Cart" button
#Then the product is added to the cart successfully
When I search for second product
Then I am displayed with the corresponding search results
When I click on any of the product
Then I am navigated to the product details page
When I select a color and size combination
And click on "Add To Cart" button
Then the product is added to the cart successfully










