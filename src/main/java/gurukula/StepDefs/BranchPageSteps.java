package gurukula.StepDefs;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import java.io.IOException;
import static gurukula.Builder.processbuilder.*;

public class BranchPageSteps {

    public BranchPageSteps() throws IOException {
        loadProperties("BranchPage.properties");
    }

    @And("^I verify user landed on Branches screen$")
    public void verifyBranchesScreen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONFIG.getProperty("BranchesTitle"))));
        Assert.assertEquals(driver.findElement(By.xpath(CONFIG.getProperty("BranchesTitle"))).getText(),"Branches",
                "Cannot verify user landed on Branches screen");
    }

    @Then("^I click on create new branch button$")
    public void iClickCreateNewBranchBtn() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath(CONFIG.getProperty("CreateNewBranchBtn"))).click();
    }

    @And("^I enter new branch name as \"([^\"]*)\" and code \"([^\"]*)\"$")
    public void enterBranch(String branchName, String code) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONFIG.getProperty("CreateBranchForm"))));
        driver.findElement(By.xpath(CONFIG.getProperty("NewBranchName"))).sendKeys(branchName);
        driver.findElement(By.xpath(CONFIG.getProperty("NewBranchCode"))).sendKeys(code);
    }

    @And("^I click on save new branch$")
    public void iClickSaveNewBranchBtn() {
        driver.findElement(By.xpath(CONFIG.getProperty("SaveBranchBtn"))).click();
    }

    @And("^I click on cancel new branch$")
    public void iClickCancelNewBranchBtn() {
        driver.findElement(By.xpath(CONFIG.getProperty("CancelBranchSaveBtn"))).click();
    }

    @And("^I enter branch name as \"([^\"]*)\" in search box and click search button$")
    public void enterBranchNameInSearchBox(String branchName) throws InterruptedException{
        driver.findElement(By.xpath(CONFIG.getProperty("SearchBranchTxtBox"))).sendKeys(branchName);
        driver.findElement(By.xpath(CONFIG.getProperty("SearchBranchBtn"))).click();
    }

    @Then("^I verify \"([^\"]*)\" branch is found$")
    public void verifySearchedBranchFound(String branchname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONFIG.getProperty("BranchTable"))));
        Assert.assertEquals(driver.findElement(By.xpath(CONFIG.getProperty("SearchedBranchRecord"))).getText(), branchname,
                "Cannot verify searched branch is found");
    }

}
