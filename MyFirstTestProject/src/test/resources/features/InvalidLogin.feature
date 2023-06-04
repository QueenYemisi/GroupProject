@ignore
Feature: Login

  Scenario Outline: Login with invalid credentials should return correct error message

    Given I get on the home page
    When I enter "<Username>" in the username field
    And I enter "<Password>" in the password field
    When I click the login
    Then I should get the correct "<errorMessage>"

    Examples:
      |Username     |Password        |errorMessage         |
      |Maggie       |admin123        |Invalid credentials  |
      |Admin        |admintesting    |Invalid credentials  |
      |Maggie       |admintesting    |Invalid credentials  |