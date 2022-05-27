@smoke
Feature: use able to login
  Scenario: user login with valid credentials

    When user click on login button
    And user enter "automation2@gmail.com" and "P@ssw0rd"
    Then user could login successfully
