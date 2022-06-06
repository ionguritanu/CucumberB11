Feature: Ebay search functionality

  Scenario: Search for iMAc 2020
    Given User is on ebay home page
    When User searches for iMac 2020
    Then User sees result about iMac only
    And There are more than 3 pages of result