Feature: Negative scenario for login and password forms

  Scenario: Incorect authorization
    Given user goes to the login page
      When Check display login block
      When User enters invalid login and password in form
    And Push button Sign in
Then There is 1 error Authentication failed
    When Clear both forms
    And User does not enter anything
    And Push button Sign in1
    Then There is 1 error An email address required
    And User enters one letter character in both forms
    And Push button Sign in2
    Then There is 1 error Invalid email address
    Given Clear both forms2
    And user enters eight digits in both forms
    And Push button Sign in3
    Then There is 1 error Invalid email address
    Given Clear both forms3
    And User enters in field login six digits and field password empty
    And Push button Sign in4
    Given Clear both forms4
    And  user enters valid uppercase values
    And Push button Sign in5





