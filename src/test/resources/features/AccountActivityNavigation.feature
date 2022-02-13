Feature: Navigating to specific accounts in Accounts Activity

  Background:
    Given the user is on login page
    When the user enters valid credentials
    Then verify that user is on Account summary page

  @wip
  Scenario Outline: Savings account redirect
    When the user clicks on "<clicks>" link on the Account Summary page

    Then verify that title is "Zero - Account Activity"
    And the default dropdown option should be "<clicks>"
    Examples:
      | clicks    |
      | Savings   |
      | Brokerage |
      | Checking  |