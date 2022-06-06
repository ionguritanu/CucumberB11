@amazon
Feature: Testing Amazon SignUp Functionality

  Background: navigate

  Scenario: Amazon SignUp with DataBase
    When user clicks sign in and create you amazon account button
    Then the user validate the header
      | Create account |
    And the user providers the information
      | ion           |
      | ion@gmail.com |
      | ion123        |
      | ion123        |