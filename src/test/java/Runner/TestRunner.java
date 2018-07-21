package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {"html:target","json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"},
        features = "src/test/resources/FeatureFiles",
        glue = "gurukula.StepDefs",
        format = {"html:target/Destination","json:target/Destination/cucumber.json"},
        tags = "@regression"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
