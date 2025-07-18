Feature: Google title

  Scenario: To validate title of Google
    Given Launch Google
    When Read title
    Then Title should be Google
