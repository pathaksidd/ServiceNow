Feature: Add new staff feature

  @regression
  Scenario Outline: Create a new staff member and save

    Given I navigate to Gurukula home page
    And I click on link to Login page
    And I enter username as "<username>"
    And I enter password as "<password>"
    When I click on login button
    And I verify user has logged in
    And I click on Staff option from Entity dropdown
    And I verify user landed on Staffs screen
    Then I click on create new staff button
    And I enter new staff name as "<staffname>" and select branch as "<branchname>"
    And I click on save new staff
    Then I click on Logout option from Account dropdown
    And I close the browser

    Examples: Login credentials

      | username | password | staffname  | branchname     |
      | admin    | admin    | sridhar     |                |
#      | admin    | admin    | james      | brancha        |
#      | admin    | admin    | james      | kkbranch       |


  @regression
  Scenario Outline: Create a new staff member and cancel

    Given I navigate to Gurukula home page
    And I click on link to Login page
    And I enter username as "<username>"
    And I enter password as "<password>"
    When I click on login button
    And I verify user has logged in
    And I click on Staff option from Entity dropdown
    And I verify user landed on Staffs screen
    Then I click on create new staff button
    And I enter new staff name as "<staffname>" and select branch as "<branchname>"
    And I click on cancel new staff
    And I close the browser

    Examples: Login credentials

      | username | password | staffname  | branchname    |
      | admin    | admin    | benjy      |               |
