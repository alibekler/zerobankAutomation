Feature: Account Types


  Background:
    Given the user is on login page
    When the user enters valid credentials
    Then verify that user is on Account summary page


  Scenario: Verify Account Summary tab ahs following account types
    Given verify that the following is displayed
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |


  Scenario: Credit Account should have 3 rows
    Then Verify if following are displayed under Credit Accounts table
    |Account|
    |Credit Card|
    |Balance|