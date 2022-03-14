@smokeLoginTest
Feature: Login Functionality for WebOrder Page

  Background:
    Given the user navigate to the WebOrder website

  Scenario: Validation for WebOrder Login Positive Scenarios
    When the user provide credentials
    Then the user is on the homepage

  @smockLogin
  Scenario Outline: Validation for WebOrder Login Negative Scenario 2
    When the user provide wrong username "<username>" and  password "<password>"
    Then the user validates the "<errorMessage>" error message
    Examples:
      | username              | password | errorMessage   |
      | guest1@microworks.com | Guest1!  | Sign in Failed |
      | 34583                 | gur      | Sign in Failed |
      | admin                 | admin&   | Sign in Failed |
      | home**                | mac      | Sign in Failed |
      | user                  | pass     | Sign in Failed |
      |                       |          | Sign in Failed |



