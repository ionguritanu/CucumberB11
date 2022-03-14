Feature: Login Functionality for WebOrder Page

  Background:
    Given the user navigate to the WebOrder website
@smoke @regression

  Scenario: Validation for WebOrder Login Positive Scenario
    # Given the user navigate to the WebOrder website
    When the user provide credentials
    Then the user is on the homepage

    Scenario: Validation for WebOrder Login Negative Scenario 1
      # Given the user navigate to the WebOrder website
      When the user provide correct username and wrong password
      Then the user validates the "Sign in Failed" error message

    Scenario: Validation for WebOrder Login Negative Scenario 2
      # Given the user navigate to the WebOrder website
      When the user provide wrong username "ion" and  password "gur"
      Then the user validates the "Sign in Failed" error message

@smoke @regression
     Scenario: Validation for WebOrder Login Negative Scenario 3
       # Given the user navigate to the WebOrder website
       When the user provide empty username end empty password
       Then the user validates the "Sign in Failed" error message


