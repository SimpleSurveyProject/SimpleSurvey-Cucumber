Feature: Evaluate

  Background: 
    Given browser open

  Scenario: evaluate survey is working
    When user visits "http://simplesurvey.de/"
    Then click "dashboard"
    Then click "Survey: Testumfrage"
    Then click "evaluate"
    Then "total answers" is shown