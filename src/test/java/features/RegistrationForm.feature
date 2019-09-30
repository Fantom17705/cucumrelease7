# new feature
# Tags: optional

Feature: Test of form for registration new users http://automationpractice.com

  Scenario: registration form positive
    Given Open home page
    When Navigate to button Sign in
    Then Open page authentification
    And find registration form
    And enter email in the input field email
    And press button Create an account
    Then page will open to create a new account
    And click radio button Mr
    And Enter data in the field First name
    And Enter value in the field Last name
    And Enter data in the field Password
    And In form Date of Birth navigate to combo box Days select value
    And In form Date of Birth navigate to combo box Months select value
    And In form Date of Birth navigate to combo box Years select value
    And Select check box Sign up for our newsletter
    And Select check box Receive special offers from our partners
    And In form Company input name company
    And In form Address input Address
    And In form City input name
    And In form State in combo box select Utah
    And  In form ZipPostal Code input value
    And  In form Mobile phone input value
    And Clear form Assign  alias
    And In form Assign an address alias for future reference input name
    And Click button Register
    Then Open page Mu Account and validation message
  #"Welcome to your account. Here you can manage all of your personal information and orders."

    Scenario: registration form negative


