Feature: Example

  Background: 
    Given can reach website

  Scenario: correct content is delivered
    When user visits "http://direct.simonlabs.de/ping"
    Then "pong" is shown
    Then close site
