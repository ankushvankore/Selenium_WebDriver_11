#Understand data driven framework in Cucumber
Feature: Login to Practice Test

  Scenario Outline: Validate login process
    Given Launch page "https://practice.expandtesting.com/login"
    When I Enter username as "<UserName>"
    When I Enter password as "<Password>"
    And Click on Login button
    Then Home page should display

    Examples: 
      | UserName | Password             |
      | practice | SuperSecretPassword! |
      | vinayak  | vinayak123           |
      | pravin   | pravin123            |
      | practice | SuperSecretPassword! |
