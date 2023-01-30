@wip
Feature: Automation Exercise Register Login Logout

  Background: Register Login Logout common steps
    Given Navigate to url "http://automationexercise.com"
    And Verify that home page is visible successfully
    Then  Click on Signup-Login button

  Scenario: TC_01 Register user
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

  Scenario: TC_02 Login user with correct email and password
    And Enter name and email address
    When Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Then Click Create Account button
    Then Click Continue button
    And Click logout button
    Then Verify Login to your account is visible
    And Enter correct email address and password
    When Click login button
    And Verify that Logged in as username is visible
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible

  Scenario: TC_03 Login user with incorrect email and password
    Then Verify Login to your account is visible
    And Enter incorrect email address and password
    When Click login button
    Then Verify error Your email or password is incorrect! is visible

  Scenario: TC_04 Logout user
    And Enter name and email address
    When Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Then Click Create Account button
    Then Click Continue button
    And Click logout button
    Then Verify Login to your account is visible
    And Enter correct email address and password
    When Click login button
    And Verify that Logged in as username is visible
    And Click logout button
    Then Verify that user is navigated to login page

  Scenario: TC_05 Register user with existing email
    Then Verify New User Signup! is visible
    And Enter name and already registered email address
    When Click Signup button
    Then Verify error Email Address already exist! is visible


