@regression
Feature: Etsy search functionality

  Background:
    Given The user navigates to "https://www.etsy.com/"

  @hat @tc1 @smoke @regression
  Scenario: Validation of Etsy search Hat
    When the user searches with "Hat"
    Then the user validates the title "Hat | Etsy"

  @key @tc2 @smoke @regression
  Scenario: Validation of Etsy search Key
    When the user searches with "Key"
    Then the user validates the title "Key | Etsy"

  @Pin @tc3 @smoke @regression
  Scenario: Validation of Etsy search Pin
    When the user searches with "Pin"
    Then the user validates the title "Pin | Etsy"

