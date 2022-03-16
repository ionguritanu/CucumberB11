Feature: Validation of Products
@productProject
  Scenario: Validation of New Product Creation
    Given The user navigates to product website homepage and click  orderButton
    When The user enters the product information "MyMoney" and "4"
    And The user enters the address information "Techtorial", "2200 E Devon", "Des Plaines", "IL","60018"
    And The user enters the card information "Visa", "123456432", "08/24"
    Then The user validates success message
    And The user validates product details "Techtorial", "MyMoney", "4", "2200 E Devon", "Des Plaines", "IL", "60018", "Visa", "123456432", "08/24"

@smoke
  Scenario Outline: Validation of New Product Creation
    Given The user navigates to product website homepage and click  orderButton
  When The user enters the product information "<productName>" and "<quantity>"
  And The user enters the address information "<customerName>", "<street>", "<city>", "<state>","<zipcode>"
  And The user enters the card information "<cartType>", "<cardNumber>", "<expireDate>"
  Then The user validates success message
  And The user validates product details "<customerName>", "<productName>", "<quantity>", "<street>", "<city>", "<state>", "<zipcode>", "<cartType>", "<cardNumber>", "<expireDate>"

    #And The user validates product details "customerName","productName","quantity","street","city","state","zipcode","cardType","cardNumber","expireDate"

    Examples:
      | productName | quantity | customerName | street       | city        | state | zipcode | cartType         | cardNumber | expireDate |
      | MyMoney     | 4        | Techtorial   | 2200 E Devon | Des Plaines | IL    | 60018   | Visa             | 123456432  | 08/24      |
      | FamilyAlbum | 6        | Walkot       | 4500 E Devon | Des Plaines | IL    | 64418   | MasterCard       | 1234456432 | 08/44      |
      | ScreenSaver | 7        | Dino         | 2255 E Devon | Chicago     | IL    | 60458   | American Express | 1232346432 | 08/24      |