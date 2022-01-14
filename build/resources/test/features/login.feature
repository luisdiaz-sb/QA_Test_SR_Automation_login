Feature: Login Feature
  Scenario: Client login successfully
    Given Client have an account
    When he send required information to login
    Then he should be see the welcome page message