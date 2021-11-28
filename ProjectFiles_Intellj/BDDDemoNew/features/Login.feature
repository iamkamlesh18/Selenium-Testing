@Login
Feature:  Login Feature
  @positivelogin
  Scenario: Positive Sign Up and Login scenario
    Given user is on login page
    When user enters "standard_user" "secret_sauce"
    And user clicks on login button
    And user is on home page
    And user clicks on logout button
    Then browser close

@negative
Scenario Outline: Negative Login Scenario
  Given user is on login page
  When user enters "<user>" "<password>"
  And user clicks on login button
  And user is on same page
  And user clicks on logout button
  Then browser close
  Examples:
    | user | password |
    | admin|admin123 |
    |      | admin123|
    | admin|         |

