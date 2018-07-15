Feature: Login test validation

  @regression
  Scenario Outline: Validate login successful scenarios

    Given I navigate to Gurukula home page
    And I click on link to Login page
    And I enter username as "<username>"
    And I enter password as "<password>"
    When I click on login button
    Then I verify user has logged in
    And I validate the username displayed is "<username>"
    Then I close the browser

    Examples: Login credentials

    | username | password        |
    | admin    | admin           |

  Scenario Outline: Validate login unsuccessful scenarios

    Given I navigate to Gurukula home page
    And I click on link to Login page
    And I enter username as "<username>"
    And I enter password as "<password>"
    When I click on login button
    Then I validate Login failure
    And I close the browser

    Examples: Login credentials

    | username | password        |
    | admin    | notadmin        |
