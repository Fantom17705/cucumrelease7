Feature: Login feature

  Scenario: Login to the site
    Given user open homepage
    When user navigate to login form
    And user enter username and password
    Then Open Account page

Feature: Search feature

    Scenario: For form search on homepage
      Given user open homepage
      When user navigate to search form
      And user enter search query
      Then search result is displayed