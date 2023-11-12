@ignore
Feature: Login

  Scenario Outline: Users with invalid credentials should not be able to login

    Given I am on the login page
    When I type in my "<username>"
    And I send in my "<password>"
    When I select the sign in button
    Then I should get an "<errorMessage>"

    Examples:
    |username                      | password           |errorMessage                                                                                               |
    |olabisibalqees@yahoo.com      | Testing2020        |The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.|
    |olabisibalqee@yahoo.com       | Testing2023        |The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.|
    |olabisibalqee@yahoo.com       | Testing202         |The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.|
    #|                              |                    |This is a required field.                                                                                  |