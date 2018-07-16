Feature: Edit branch feature

  @regression
  Scenario Outline: Search for a branch and edit it

    Given I navigate to Gurukula home page
    And I click on link to Login page
    And I enter username as "<username>"
    And I enter password as "<password>"
    When I click on login button
    And I verify user has logged in
    And I click on Branch option from Entity dropdown
    And I verify user landed on Branches screen
    And I enter branch name as "<branchname>" in search box and click search button
    And I verify "<branchname>" branch is found
    Then I click on edit branch button
    And I enter new branch name as "<newbranchname>" and code "<newbranchcode>"
    And I click on save new branch
    Then I click on Logout option from Account dropdown
    And I close the browser

    Examples: Login credentials

      | username | password | branchname | newbranchname | newbranchcode |
      | admin    | admin    | branchnn   | newbranchnn   | 0003          |

  @regression
  Scenario Outline: Search for a branch, click edit and cancel

    Given I navigate to Gurukula home page
    And I click on link to Login page
    And I enter username as "<username>"
    And I enter password as "<password>"
    When I click on login button
    And I verify user has logged in
    And I click on Branch option from Entity dropdown
    And I verify user landed on Branches screen
    And I enter branch name as "<branchname>" in search box and click search button
    And I verify "<branchname>" branch is found
    Then I click on edit branch button
    And I click on cancel new branch
    Then I click on Logout option from Account dropdown
    And I close the browser

    Examples: Login credentials

      | username | password | branchname |
      | admin    | admin    | bbranch    |

