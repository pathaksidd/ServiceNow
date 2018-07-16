package gurukula.StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.IOException;

import static gurukula.Builder.processbuilder.*;
import static gurukula.Builder.processbuilder.CONFIG;

public class ViewSingleBranchPageSteps {

    public ViewSingleBranchPageSteps() throws IOException {
        loadProperties("ViewSingleBranchPage.properties");
    }

    @Then("^I verify \"([^\"]*)\" branch details is viewed$")
    public void verifyViewedBranchOpened(String branchname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONFIG.getProperty("ViewingBranchTitleTxt"))));
        Assert.assertEquals(driver.findElement(By.xpath(CONFIG.getProperty("ViewingBranchName"))).getAttribute("value"), branchname,
                "Cannot verify viewed branch is opened");
    }

    @And("^I click back button$")
    public void clickBackButton() {
        driver.findElement(By.xpath(CONFIG.getProperty("BackBtn"))).click();
    }

}
