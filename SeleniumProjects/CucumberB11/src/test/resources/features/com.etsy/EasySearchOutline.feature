Feature: Etsy search functionality

  Background:
    Given The user navigates to "https://www.etsy.com/"
@regressionoutline
  Scenario Outline: Validation of Etsy search Hat
    When the user searches with "<searchvalue>"
    Then the user validates the title "<titlevalidation>"
    Examples:
    #ctrl+alt+L --> windows
    #command+option+L --mac
      | searchvalue | titlevalidation |
      |Hat          |  Hat \| Etsy    |
      |Key          |  Key \| Etsy    |
      |Pin          |  Pin \| Etsy    |
      |bab          |  no title       |

