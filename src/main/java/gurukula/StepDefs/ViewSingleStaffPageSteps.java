package gurukula.StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.IOException;

import static gurukula.Builder.processbuilder.*;
import static gurukula.Builder.processbuilder.CONFIG;
import static gurukula.Builder.processbuilder.driver;

public class ViewSingleStaffPageSteps {

    public ViewSingleStaffPageSteps() throws IOException {
        loadProperties("ViewSingleStaffPage.properties");
    }

    @Then("^I verify \"([^\"]*)\" staff details is viewed$")
    public void verifyViewedBranchOpened(String branchname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONFIG.getProperty("ViewingStaffTitleTxt"))));
        Assert.assertEquals(driver.findElement(By.xpath(CONFIG.getProperty("ViewingStaffName"))).getAttribute("value"), branchname,
                "Cannot verify viewed staff is opened");
    }

    @And("^I click staff back button$")
    public void clickBackButton() {
        driver.findElement(By.xpath(CONFIG.getProperty("StaffPageBackBtn"))).click();
    }

}
