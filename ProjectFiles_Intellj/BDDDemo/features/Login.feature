Feature: Sign Up and Login Feature
  Scenario: Positive Sign Up and Login scenario
    Given user is on login page
    When user click on sign up page
    And user enters name mobile and password "Kamlesh" "7770000347" "Asd@123"
    And user clicks on submit button
    Then user is signing in with the same account "7770000234" "Asd@123"
