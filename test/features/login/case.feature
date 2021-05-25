Feature: Login

  Background: 
    Given browser open

  Scenario: correct login is working
    When user visits "http://simplesurvey.de/"
    Then click "Login"
    Then fill '//*[@id="mat-input-0"]' "testaccount"
    Then fill '//*[@id="mat-input-1"]' "testpassword"
    Then click 'Submit'
    Then "Dashboard" is shown

  Scenario: wrong login is not working
    When user visits "http://simplesurvey.de/"
    Then click "Login"
    Then fill '//*[@id="mat-input-0"]' "accountdoesnoexist"
    Then fill '//*[@id="mat-input-1"]' "no_password"
    Then click 'Submit'
    Then "Something went wrong!" is shown
