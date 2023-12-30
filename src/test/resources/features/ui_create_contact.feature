@AddContact
Feature: Adding a New Contact

  Scenario Outline: Add contact e2e

    Given user goes to "https://thinking-tester-contact-list.herokuapp.com/"
    When user enters email as "john.doe@clarusway.com"
    And user enters password as "John.123"
    And user clicks on Submit button
    And user clicks on Add a New Contact button
    And user enters First Name as "<First Name>"
    And user enters Last Name as "<Last Name>"
    And user enters Date of Birth as "<Date of Birth>"
    And user enters contact Email as "<Email>"
    And user enters Phone as "<Phone>"
    And user enters Street Address1 as "<Street Address 1>"
    And user enters Street Address2 as "<Street Address 2>"
    And user enters City as "<City>"
    And user enters State or Province as "<State or Province>"
    And user enters Postal Code as "<Postal Code>"
    And user enters Country "<Country>"
    And user clicks on contact Submit button

    Examples:
      | First Name | Last Name | Date of Birth | Email            | Phone    | Street Address 1 | Street Address 2 | City        | State or Province | Postal Code | Country |
      | Ali        | Can       | 2000/12/12    | alican@gmail.com | 12356789 | Street Address 1 | Street Address 2 | Long Island | NY                | 123         | USA     |




