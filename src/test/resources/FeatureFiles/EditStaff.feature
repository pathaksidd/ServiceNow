@regression
Feature: Edit staff feature

  Scenario Outline: Search for a staff, edit it and save

    Given I navigate to Gurukula home page
    And I click on link to Login page
    And I enter username as "<username>"
    And I enter password as "<password>"
    When I click on login button
    And I verify user has logged in
    And I click on Staff option from Entity dropdown
    And I verify user landed on Staffs screen
    Then I enter staff name as "<staffname>" in search box and click search button
    And I verify "<staffname>" staff is found
    And I click on edit staff button
    And I enter new staff name as "<newstaffname>" and select branch as "<newbranch>"
    And I click on save new staff
    And I close the browser

    Examples: Login credentials

      | username | password | staffname | newstaffname | newbranch  |
      | admin    | admin    | newaftab  | aftab        | litreature |

  Scenario Outline: Search for a staff, edit it and cancel

    Given I navigate to Gurukula home page
    And I click on link to Login page
    And I enter username as "<username>"
    And I enter password as "<password>"
    When I click on login button
    And I verify user has logged in
    And I click on Staff option from Entity dropdown
    And I verify user landed on Staffs screen
    Then I enter staff name as "<staffname>" in search box and click search button
    And I verify "<staffname>" staff is found
    And I click on edit staff button
    And I click on cancel new staff
    And I close the browser

    Examples: Login credentials

      | username | password | staffname    |
      | admin    | admin    | quentin      |
