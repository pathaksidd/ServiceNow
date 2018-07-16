Feature: View branch feature

  @regression
  Scenario Outline: Search for a branch and view it

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
    Then I click on view branch button
    And I verify "<branchname>" branch details is viewed
    And I click back button
    And I close the browser

    Examples: Login credentials

      | username | password | branchname | branchcode |
      | admin    | admin    | branchb    | 0003       |
