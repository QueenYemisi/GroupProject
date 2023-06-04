Feature: Logout
 Background:
   Given I am  on the application home page
   And I login

  Scenario: Verify that the logout functionality works correctly

    Given I click loggedIn user link
    When I click the logout link
    Then I should be logged out successfully

    