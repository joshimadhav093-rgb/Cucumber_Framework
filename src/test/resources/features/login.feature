Feature: validate login functionality

  Scenario Outline: Check that user is able to login with valid credentials

    Given Browser is open
    And user is on login page
    Then User Enter <username> and <password>
    When click on login button
    Then user land on home page


    Examples:
    |username|password|
    |standard_user|secret_sauce|
