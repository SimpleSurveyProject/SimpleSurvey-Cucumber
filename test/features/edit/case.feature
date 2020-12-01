Feature: Edit

  Background: 
    Given browser open

  Scenario: edit survey title is working
    When user visits "http://simplesurvey.de/"
    Then click "dashboard"
    Then click "Survey: Testumfrage"
    Then click "edit"
    Then fill "title" "Umfrage zum Alter"
    Then "Survey: Umfrage zum Alter" is shown