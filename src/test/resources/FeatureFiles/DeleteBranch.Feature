Feature: Delete branch feature

  @regression
  Scenario Outline: Search for a branch and delete it

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
    Then I click on delete branch button
    And I click on confirm delete branch
    And I close the browser

    Examples: Login credentials

      | username | password | branchname |
      | admin    | admin    | branchmm    |

  @regression
  Scenario Outline: Search for a branch, click delete and cancel

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
    Then I click on delete branch button
    And I click on cancel delete branch
    And I close the browser

    Examples: Login credentials

      | username | password | branchname |
      | admin    | admin    | branchk    |
