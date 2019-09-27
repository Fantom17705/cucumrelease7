Feature: Negative scenario for login and password forms

  Scenario: Incorect authorization
    Given user goes to the login page
      When Check display login block
      When User enters invalid login and password in form
    And Push batton Sign in
Then There is 1 error Authentication failed
    Given Clear both forms
    And User does not enter anything
    And Push batton Sign in
    Then There is 1 error An email address required
    And User enters one letter character in both forms
    And Push batton Sign in
    Then There is 1 error Invalid email address
    Given Clear both forms
    And user enters eight digits in both forms
    And Push batton Sign in
    Then There is 1 error Invalid email address
    Given Clear both forms
    And User enters in field login six digits and field password empty
    And Push button Sign in
    Given Clear both forms
    And  user enters valid uppercase values
    And Push batton Sign in2





