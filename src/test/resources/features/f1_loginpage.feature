Feature: LoginTest (Valid and Invalid user login)  

Scenario: Test to verify Valid user login
Given I am on the Levis login page
When I enter a valid credentials
And I click on "SignIn" button
Then I am navigated to the HomePage
When I click on "Signout" button on Home page
Then I am successfully logged out

Scenario: Test to verify Invalid user login
When I enter an invalid credentials
Then I am displayed with incorrect credentials message







