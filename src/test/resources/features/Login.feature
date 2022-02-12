Feature: Login
@wip
  Scenario: Login type zerobank
    Given the user is on login page
    When the user enters valid credentials
    Then verify that user is on Account summary page

