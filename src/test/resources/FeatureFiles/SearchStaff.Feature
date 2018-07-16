Feature: Search staff feature

  @regression
  Scenario Outline: Search for a staff

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

    Examples: Login credentials

      | username | password | staffname |
      | admin    | admin    | kevin     |
