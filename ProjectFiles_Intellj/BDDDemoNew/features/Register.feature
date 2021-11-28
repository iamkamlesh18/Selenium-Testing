@Register
Feature: Registration Feature
#  1 scenario for reg
  @positive
  Scenario: Positive Reg. scenario
    Given user is on registration page
    When user enters details
    |username|priti|
    |password|priti123|
    |confirmpass|priti123|
    |mob|1234567890|
    |comp|cg|
    And user clicks on submit button
    Then user is Successfully register
