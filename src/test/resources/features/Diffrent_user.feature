Feature: Valid login Different user

  Scenario Outline: Validate that different users are able to login
    Given browser is open
    And Different user is on login page
    When user enter <username> and <password>
    And Click on login button




  Examples:
    |username|password|
    |locked_out_user|secret_sauce|
    |problem_user|secret_sauce|
    |performance_glitch_user|secret_sauce|
    |error_user|secret_sauce|
    |visual_user|secret_sauce|