Feature: Fillout

  Background: 
    Given browser open

  Scenario: fillout survey title is working
    When user visits "http://simplesurvey.de/survey/2h4j3h2"
    Then click "start"
    Then fill "answer" "meine Antwort"
    Then click "send"
    Then "thank you" is shown