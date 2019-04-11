Feature: Am I on google page 
   tests to verify google main page 
  Scenario: is web page up 
    Given I open webpage 
    When I read title 
    Then title should be "Google" 
