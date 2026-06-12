@Valid_Invalid
Feature: validate login functionality
      Background:
        Given Browser is open
        And Standard user is on login page

  Scenario Outline: Check that user is able to login with valid credentials
    Then User Enter <username> and <password>
    When click on login button
    Then user land on home page

    Examples:
    |username|password|
    |standard_user|secret_sauce|

  Scenario Outline: Validate that different users are able to login
    Then User Enter <username> and <password>
    When click on login button
    Then user land on home page

    Examples:
      |username|password|
      |locked_out_user|secret_sauce|
      |problem_user|secret_sauce|
      |performance_glitch_user|secret_sauce|
      |error_user|secret_sauce|
      |visual_user|secret_sauce|
