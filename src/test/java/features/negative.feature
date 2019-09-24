Feature: Negative scenario for login and password forms

  Scenario: Incorect authorization
    Given Open homepage
    When User enters navigate login and password in form
    And Push batton Sign in
Then There is 1 error Authentication failed
    Given Clear both forms
    And User does not enter anything
    And User enters one letter character in both forms
    And User enters one digit in both forms
    And User enters in field login six digits and field password empty
    And Push button Sign in
    Given Clear both forms
    And  user enters a valid login and invalid password
  Then There is 1 error Password is required




