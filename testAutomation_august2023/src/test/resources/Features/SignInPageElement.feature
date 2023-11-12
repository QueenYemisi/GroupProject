Feature: Login

  Scenario: Check that the login page contains the correct fields and button

    Given I am on the Landing page
    When I click on the sign in link
    Then I should see username password and login button