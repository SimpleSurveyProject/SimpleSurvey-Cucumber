Feature: Login

  Background: 
    Given browser open

  Scenario: correct login is working
    When user visits "http://simplesurvey.de/"
    Then click "/html/body/app-root/app-navbar/mat-toolbar/button[3]"
    Then fill '//*[@id="mat-input-0"]' "testuser2"
    Then click '//*[@id="cdk-step-content-0-0"]/form/div/button'
    Then fill '//*[@id="mat-input-1"]' "123456"
    Then click '//*[@id="cdk-step-content-0-1"]/form/div/button[2]'
		Then "Dashboard" is shown