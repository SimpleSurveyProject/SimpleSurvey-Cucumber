Feature: Create

  Background: 
    Given browser open

  Scenario: create survey is working
    When user visits "http://simplesurvey.de/"
    Then click "dashboard"
    Then click "create new survey"
    Then fill "title" "Testumfrage"
    Then click "add question"
    Then fill "question_title" "Testfrage"
    Then click "add answer"
    Then fill "answer_1_text" "Antwort 1"
    Then click "add answer"
    Then fill "answer_2_text" "Antwort 2"
    Then click "create survey"
    Then "Survey: Testumfrage" is shown