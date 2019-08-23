@mytag
Feature: Test End to End scenario for Mahajeevan Plan

 @smokeTest(value=2)
  Scenario: Verify the login functionality
  Given Open Browser 
  When Enter valid credentials
  Then User should be able to login
  
   
  @Regression(value=1)
  Scenario: Verify the logout functionality
  Given User logged in 
  When user is on home page
  And click on signout link
  Then User should be able to login
  
  @E2E(value=3)
  Scenario: Verify the cart functionality
  When User is logged in 
  Then  selected the items to cart
  And user clicked on cart link 
  Then User should be able to add items to cart
  
  
  
 
  
   