Feature: Create Account

  Background:
    Given I am on the home page

  Scenario: Verify that new user can create account
    When I click on the create account link
    And I enter all required details
    When I click on the create account button
    Then My account should be created successfully
