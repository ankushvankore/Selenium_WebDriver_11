@AllTests
Feature: Tirabeauty test

  Background: 
    Given Launch "https://www.tirabeauty.com/"

  @MakeupTest
  Scenario: Test Makeup link
    When I Click on Makeup link
    Then Makeup page should display

  @SkinTest
  Scenario: Test Skin link
    When I Click on Skin link
    Then Skin page should display

  @MenTest
  Scenario: Test Men link
    When I Click on Men link
    Then Men page should display

  @MomnBabyTest
  Scenario: Test Mom & Baby link
    When I Click on Mom & Baby link
    Then Mom & Baby page should display
