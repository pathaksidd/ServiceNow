package gurukula.StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import java.io.IOException;
import static gurukula.Builder.processbuilder.*;

public class LandingPageSteps {

    public LandingPageSteps() throws IOException {
        loadProperties("LandingPage.properties");
    }

    @Then("^I verify user has logged in$")
    public void verifyUserLoggedIn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONFIG.getProperty("WelcomeText"))));
        Assert.assertEquals(driver.findElement(By.xpath(CONFIG.getProperty("WelcomeText"))).getText(),"Welcome to Gurukula!", "Cannot verify login successful");
    }

    @And("^I validate the username displayed is \"([^\"]*)\"$")
    public void validateUsername(String expectedUsername) throws InterruptedException {
        String actual = driver.findElement(By.xpath(CONFIG.getProperty("LoggedUsername"))).getText();
        boolean contains = actual.contains(expectedUsername);
        Assert.assertTrue(contains, "Cannot verify username is correct");
        Thread.sleep(1000);
    }

    @And("^I click on Branch option from Entity dropdown$")
    public void iSelectBranchEntityDropdownBtn() throws InterruptedException {
        driver.findElement(By.xpath(CONFIG.getProperty("EntityDropdown"))).click();
        driver.findElement(By.xpath(CONFIG.getProperty("EntityBranchOption"))).click();
    }

    @And("^I click on Staff option from Entity dropdown$")
    public void iSelectStaffEntityDropdownBtn() throws InterruptedException {
        driver.findElement(By.xpath(CONFIG.getProperty("EntityDropdown"))).click();
        driver.findElement(By.xpath(CONFIG.getProperty("EntityStaffOption"))).click();
        Thread.sleep(1000);
    }
}
