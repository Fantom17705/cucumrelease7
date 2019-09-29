# new feature
# Tags: optional

Feature: Test of form for registration new users http://automationpractice.com

  Scenario: registration form positive
    Given Open home page
    When Navigate to button Sign in
    Then Open page authentification
    And find registration form
    And enter email in the input field email = "Dmitriy11705@ukr.net"
    And press button "Create an account"
    Then page will open to create a new account
    And click radio button "Mr."
    And Enter data in the field "First name" = "Dmitriy"
    And Enter data in the field "Last name" = "Rush"
    And Enter data in the field "Password" = "Dmitriy11705"
    And In form "Date of Birth" navigate to combo box "Days" select value "9"
    And In form "Date of Birth" navigate to combo box "Months" select value "Juli"
    And In form "Date of Birth" navigate to combo box "Years" select value "1989"
    And Select check box "Sign up for our newsletter!"
    And Select check box "Receive special offers from our partners!"
    And In form "Company" input name company = "Rush+"
    And In form "Address" input Address = "New Bentley 1 street"
    And In form "City" input name = "Solt Lake City"
    And In form "State" in combo box select  = "Utah"
    And  In form "Zip/Postal Code" input value  = "84081"
    And  In form "Mobile phone" input value  = "+610001122171"
    And Clear form "Assign an address alias for future reference"
    And In form "Assign an address alias for future reference" input name  = "Rush"
    And Click button "Register"
    Then Open page "Mu Account" and message "Welcome to your account. Here you can manage all of your personal information and orders."

    Scenario: registration form negative


