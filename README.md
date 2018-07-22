# ServiceNow
Gurukula application automation

- This is a Maven based project written using Java, Selenium and Cucumber.
- The automation framework is built using Page Object Model.
- It covers the following use cases. The automation scripts and are written in feature files using Gherkin language:

1. Login-LogOut validation
2. Add new branch 
3. Add new staff
4. Edit an existing branch
5. Edit an existing staff
6. View a branch
7. View staff
8. Search for a branch
9. Search for a staff
10. Delete a branch
11. Delete a staff

- Defects excel sheet has been added which covers the defects found in the application
- taking screenshot functionality is added but not used in scripts. (method could be called from any steps)


To run the tests-
1. Clone the framework and open using IntelliJ Idea (Any other IDE should work fine as well).
2. To run individual scenario from IDE please install Cucumber plugin and Gherkin plugin for IDE. 
   Then right click on the feature files and click "Run feature file"
3. To run individual test from command line or terminal, use following command-
   mvn test -Dcucumber.options="src/test/resources/FeatureFiles/${SCENARIO_NAME}.feature"
4. To run all the scenarios at once from command line, use following command-
   mvn test -Dcucumber.options="--tags @regression"

