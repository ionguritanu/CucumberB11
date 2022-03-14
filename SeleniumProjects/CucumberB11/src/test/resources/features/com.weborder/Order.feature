Feature: WebOrder Page Food Order

  Background:
    Given the user is on weborder homepage
    When the user selects "Office" options
    And th user is on the groupOrderPage
    And  the user send invitees note "Test"
    And the user sends invite list "ion@gmail.com" and "eric@gmail.com"
@smoke @Office @special
  Scenario: Validation of food oder for office
    # Given the user is on weborder homepage
    # When the user selects "Office" options
    # And th user is on the groupOrderPage
    # And  the user send invitees note "Test"
    # And the user sends invite list "ion@gmail.com" and "eric@gmail.com"
    Then the user validates the "2012 EMPIRE BLVD" adress
    * the user validates "View Group Order" text
    * the user validates the total participants is 1

@MyHouse @regression @smoke
  Scenario: Validation of food oder for My House
    #  Given the user is on weborder homepage
    # When the user selects "Office" options
    # And th user is on the groupOrderPage
    # And  the user send invitees note "Test"
    # And the user sends invite list "ion@gmail.com" and "eric@gmail.com"
    And the user selects "My House" options
    Then the user validates the "2112 EMPIRE BLVD" adress
    * the user validates "View Group Order" text
    * the user validates the total participants is 1
