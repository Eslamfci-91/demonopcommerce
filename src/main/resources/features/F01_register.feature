@smoke
Feature: user should be able to register

  Scenario: user register successfully
    When user click on register button
    And user fill personal details
    And user fill company details
    And user fill password
    And click on register button
    Then user registration done
