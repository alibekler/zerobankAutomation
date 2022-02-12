Feature: Account Activity features

  Background:
    Given the user is on login page
    When the user enters valid credentials
    Then verify that user is on Account summary page

  @wip
  Scenario: Verify title
    Then verify that title is "Zero - Account Activity"
