#Demo for understand the concept of passing data to Step definition
Feature: Rediff registration

  Background: 
    Given Open rediff registration page

  Scenario: Validate registration process of Rediff with valid data
    When I enter valid fullName as "Ankush Vankore"
    When I enter valid rediffid as "ankushvankore123"
    When I Enter valid password as "Ankush@123"
    When I reenter valid password as "Ankush@123"
    When I select birth date as
      | 29 | JAN | 1979 |
    And I Click on check Availablity button
    Then Rediff id available message should display

  Scenario: Validate registration process of Rediff with invalid data
    When I enter invalid fullName as "Vinayak Patil"
    When I enter invalid rediffid as "vinayakpatil"
    When I Enter invalid password as "Vinayak@123"
    When I reenter invalid password as "Vinayak@123"
    When User selectes birth date as
      | Day | Month | Year |
      |  18 | MAY   | 2000 |
    And user click on check Availablity button
    Then Rediff id not available message should display
