Feature: Fillout

  Background: 
    Given browser open
    Given user logged in

  Scenario: fillout survey is working
    When click "Dashboard"
    Then click "Fill out survey"
    Then fill "//*[@id=\"mat-input-0\"]" "130"
    Then click "Submit"
    Then click xpath "/html/body/app-root/app-fillout/div/mat-accordion/mat-expansion-panel"
    Then fill "//*[@id=\"mat-input-1\"]" "EXAMPLE_ANSWER"
    Then click "Submit"
    Then "Answers sent successfully" is shown
