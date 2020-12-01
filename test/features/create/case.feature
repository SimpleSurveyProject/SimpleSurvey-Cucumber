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
    Then fill "//*[@id=\"mat-input-2\"]" "Test_Question"
    Then click "Submit"
    Then "Survey successfully created" is shown
    