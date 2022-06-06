Feature: Testing google functionalities

  Scenario: Happy path Google search functionalities
    Given I navigate to google.com
    When I search for Techtorial
    Then I get more than 10 links results on the google page

