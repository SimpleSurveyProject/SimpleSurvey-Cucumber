Feature: Example

  Background: 
    Given browser open

  Scenario: correct content is delivered
    When user visits "http://simplesurvey.de/"
    Then "test" is shown