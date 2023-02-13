#Author: ingridmunera24@gmail.com

Feature: Login swaglabs web page
  As a user
  I want to log in to the swaglabs application
  to view the products

  @ValidCredentials
  Scenario: Login with valid credentials
    Given "User" is on the login page "https://www.saucedemo.com/"
    When user attempts to login with username "standard_user" and password "secret_sauce".
    Then user can see the inventory page

    @InvalidCredential
  Scenario: Login with wrong password
    Given "User" is on the login page "https://www.saucedemo.com/"
    When user attempts to login with username "standard_user" and password "wrong_password".
    Then user should see an error message