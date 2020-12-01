Feature: Evaluate

  Background: 
    Given browser open
    Given user logged in

  Scenario: evaluate survey is working
    When click "Dashboard"
    Then click xpath "//*[@id=\"mat-expansion-panel-header-0\"]"
    Then click "Show answers"
    Then click xpath "/html/body/app-root/app-fillout/div/mat-accordion/mat-expansion-panel"
		
