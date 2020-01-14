Feature: Customer Withdrawl Successfully

  Background:
    Given Open website https://www.way2automation.com/angularjs-protractor/banking/#/login

  Scenario Outline: Customer Withdrawl Successfully
    When I login successfully with the account as <name>
    And I deposited into my account <deposit>
    And I click on Withdrawl button
    And I type amount to be Withdrawl as <withdrawl>
    And I click on the Withdrawl button to submit withdrawl
#    Then I verify withdrawl form is appeared
    Then I verify user withdrawl successfully

    Examples:
      | name         | deposit | withdrawl |
      | Harry Potter | 3000    | 1000      |


  Scenario Outline: Customer Withdrawl Unsuccessfully
    When I login successfully with the account as <name>
    And I deposited into my account <deposit>
    And I click on Withdrawl button
    And I type amount to be Withdrawl as <withdrawl>
    And I click on the Withdrawl button to submit withdrawl
    Then I verify user withdrawl unsuccessfully

    Examples:
      | name         | deposit | withdrawl |
      | Harry Potter | 1000    | 3000      |