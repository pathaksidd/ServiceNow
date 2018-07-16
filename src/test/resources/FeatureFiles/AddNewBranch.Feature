Feature: Add new branch feature

  @regression
  Scenario Outline: Create a new branch and save

    Given I navigate to Gurukula home page
    And I click on link to Login page
    And I enter username as "<username>"
    And I enter password as "<password>"
    When I click on login button
    And I verify user has logged in
    And I click on Branch option from Entity dropdown
    And I verify user landed on Branches screen
    Then I click on create new branch button
    And I enter new branch name as "<branchname>" and code "<branchcode>"
    And I click on save new branch
    Then I click on Logout option from Account dropdown
    And I close the browser

    Examples: Login credentials

      | username | password | branchname | branchcode |
      | admin    | admin    | branchb    | 0003       |

  @regression
  Scenario Outline: Create a new branch and Cancel

    Given I navigate to Gurukula home page
    And I click on link to Login page
    And I enter username as "<username>"
    And I enter password as "<password>"
    When I click on login button
    And I verify user has logged in
    And I click on Branch option from Entity dropdown
    And I verify user landed on Branches screen
    Then I click on create new branch button
    And I enter new branch name as "<branchname>" and code "<branchcode>"
    And I click on cancel new branch
    Then I click on Logout option from Account dropdown
    And I close the browser

    Examples: Login credentials

      | username | password | branchname | branchcode |
      | admin    | admin    | Economics  | 0002       |
