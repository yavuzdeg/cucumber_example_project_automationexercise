@wip
Feature: Automation Exercise Register Login Logout

  Background: Register Login Logout common steps
    Given Navigate to url "http://automationexercise.com"
    And Verify that home page is visible successfully
    Then  Click on Signup / Login button

  Scenario: TC_01 Register User
    Then Verify New User Signup! is visible
    And Enter name and email address
    When Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    Then Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Then Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    Then Click Continue button
    And Verify that Logged in as username is visible
    Then Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible and click Continue button
