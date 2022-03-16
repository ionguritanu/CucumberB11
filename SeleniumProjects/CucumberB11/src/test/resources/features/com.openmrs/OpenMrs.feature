Feature: Open MRS tests

  @openMRS
  Scenario: Register a patient
    Given the user log in OpenMrs with following credentials
      | username | admin    |
      | password | Admin123 |
#    When the user register a new patient with following information:
#      | GivenMane  | Ion      |
#      | FamilyName | Guritanu |
    When the user register a new patient for following information
      | GivenName    | Ion         |
      | FamilyName   | Gur         |
      | Gender       | Male        |
      | Dya          | 8           |
      | Month        | March       |
      | Year         | 1990        |
      | Address      | 1900 Silver |
      | PhoneNumber  | 123456123   |
      | relationType | Doctor      |
      | RelativeName | Patel       |


    Then  then the user validates the patient name and family name
      | GivenName  | Ion |
      | FamilyName | Gur |

