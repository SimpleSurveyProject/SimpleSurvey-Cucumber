Feature: Login

  Background: 
    Given browser open

  Scenario: correct login is working
    When user visits "http://simplesurvey.de/"
    Then click "Login"
    Then fill '//*[@id="mat-input-0"]' "testuser2"
    Then click 'Next'
    Then fill '//*[@id="mat-input-1"]' "123456"
    Then click 'Submit'
		Then "Dashboard" is shown