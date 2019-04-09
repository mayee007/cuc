Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"
    
    Scenario: Friday is Friday
    Given today is Friday
    When I ask whether it's Friday yet
    Then I should be told "Enjoy, Today is Friday"
    
    Scenario: Thursday isn't Friday
    Given today is Thursday
    When I ask whether it's Friday yet
    Then I should be told "Nope"
    
    Scenario: Empty isn't Friday
    Given today is ""
    When I ask whether it's Friday yet
    Then I should be told "Nope"