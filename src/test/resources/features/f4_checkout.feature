Feature: CheckOutPageTest (Place Order)

Scenario: Test to verify that the user is able to navigate to the checkout page and place an order 

When I click on checkout button on Cart page
Then I am navigated to the Checkout page
#When I select a Payment Option 
#And a Delivery Address
And I click on Place Order button
Then the order is placed successfully

#Scenario: Order Confirmation page field validations
#When I am on Order Confirmation page 
#Then I am  able to view the following fields
