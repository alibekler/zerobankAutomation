Feature: PayBills tests

  Background:
    Given the user is on login page
    When the user enters valid credentials
    Then verify that user is on Account summary page


  Scenario: verify title
    Given navigate to "Pay Bills"
    Then verify that title is "Zero - Pay Bills"



  Scenario: successful payment verification
    Given navigate to "Pay Bills"
    When the user makes a payment
    Then verify that confirmation message is displayed


    Scenario: making payment without filling the date field
      Given navigate to "Pay Bills"
      When the user makes a payment without  date input


