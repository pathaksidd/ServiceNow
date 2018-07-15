package gurukula.StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;

import static gurukula.Builder.processbuilder.*;

public class StaffPageSteps {

    public StaffPageSteps() throws IOException {
        loadProperties("StaffPage.properties");
    }

    @And("^I verify user landed on Staffs screen$")
    public void verifyStaffScreen() {
        Assert.assertEquals(driver.findElement(By.xpath(CONFIG.getProperty("StaffsTitleTxt"))).getText(),"Staffs",
                "Cannot verify user landed on Staffs screen");
    }

    @Then("^I click on create new staff button$")
    public void iClickCreateNewBranchBtn() throws InterruptedException {
        driver.findElement(By.xpath(CONFIG.getProperty("CreateNewStaffBtn"))).click();
        Thread.sleep(1000);
    }

    @And("^I enter new staff name as \"([^\"]*)\" and select branch as \"([^\"]*)\"$")
    public void enterBranch(String staffName, String branchName) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONFIG.getProperty("CreateStaffForm"))));
        driver.findElement(By.xpath(CONFIG.getProperty("NewStaffName"))).sendKeys(staffName);
        Select branchDropdown = new Select(driver.findElement(By.xpath(CONFIG.getProperty("NewStaffBranchDropdown"))));
        branchDropdown.selectByVisibleText(branchName);
        Thread.sleep(500);
    }

    @And("^I click on save new staff")
    public void iClickSaveNewStaffBtn() throws InterruptedException {
        driver.findElement(By.xpath(CONFIG.getProperty("SaveStaffBtn"))).click();
        Thread.sleep(1000);
    }

    @And("^I click on cancel new staff")
    public void iClickCancelNewStaffBtn() {
        driver.findElement(By.xpath(CONFIG.getProperty("CancelStaffSaveBtn"))).click();
    }

    @And("^I enter staff name as \"([^\"]*)\" in search box and click search button$")
    public void enterStaffNameInSearchBox(String staffName) throws InterruptedException{
        driver.findElement(By.xpath(CONFIG.getProperty("SearchStaffTxtBox"))).sendKeys(staffName);
        driver.findElement(By.xpath(CONFIG.getProperty("SearchStaffBtn"))).click();
        Thread.sleep(1000);
    }

    @Then("^I verify \"([^\"]*)\" staff is found$")
    public void verifySearchedStaffFound(String staffName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONFIG.getProperty("StaffTable"))));
        Assert.assertEquals(driver.findElement(By.xpath(CONFIG.getProperty("SearchedStaffRecord"))).getText(), staffName,
                "Cannot verify searched staff is found");
    }
}
