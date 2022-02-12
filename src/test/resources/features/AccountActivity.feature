Feature: Account Activity features

  Background:
    Given the user is on login page
    When the user enters valid credentials
    Then verify that user is on Account summary page


  Scenario: Verify title
    Then verify that title is "Zero - Account Activity"


  Scenario: Account dropdown default option should be Savings.
    When verify that title is "Zero - Account Activity"
    Then the default dropdown option should be "Savings"


    Scenario: Account dropdown options
      When verify that title is "Zero - Account Activity"
      Then dropdown should have following options
        | Savings     |
        | Checking    |
        | Loan        |
        | Credit Card |
        | Brokerage   |

  @wip
    Scenario: Transactions table should have following columns
      When verify that title is "Zero - Account Activity"
      Then transactions table has following tables
        | Date        |
        | Description |
        | Deposit     |
        | Withdrawal  |
