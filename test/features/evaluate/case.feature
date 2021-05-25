Feature: Evaluate

  Background: 
    Given browser open
    Given user logged in

  Scenario: evaluate survey is working
    When click "Dashboard"
    Then click xpath "//*[@id=\"mat-expansion-panel-header-0\"]"
    Then click xpath "//*[@id=\"cdk-accordion-child-0\"]/div/button[1]/span/mat-icon"
    Then "Test_Question" is shown
		
