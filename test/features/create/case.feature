Feature: Create

  Background: 
    Given browser open
    Given user logged in

  Scenario: create survey is working
    When click "Dashboard"
    Then click "Create new survey"
    Then fill "//*[@id=\"mat-input-0\"]" "TEST_SURVEY_TITLE"
    Then fill "//*[@id=\"mat-input-1\"]" "TEST_SURVEY_DESCRIPTION"
    Then click "Next"
    Then click "add new question"
    Then click xpath "//*[@id=\"mat-radio-2\"]/label/div[1]/div[1]"
    Then fill "//*[@id=\"mat-input-2\"]" "Test_Question"
    Then click "create new survey"
    Then "Survey successfully created" is shown
    