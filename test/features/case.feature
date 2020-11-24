Feature: Example

Background:
 Given can reach website

Scenario: correct content is delivered
 When user visits site
 Then hello-world is shown
 And browser will closed
