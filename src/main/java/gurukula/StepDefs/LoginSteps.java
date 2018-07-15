package gurukula.StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.IOException;
import static gurukula.Builder.processbuilder.*;

public class LoginSteps {

    public LoginSteps() throws IOException {
        loadProperties("LoginPage.properties");
    }

    @And("^I enter username as \"([^\"]*)\"$")
    public void iEnterUserName(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONFIG.getProperty("LoginField"))));
        driver.findElement(By.xpath(CONFIG.getProperty("LoginField"))).sendKeys(username);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        driver.findElement(By.xpath(CONFIG.getProperty("passwordField"))).sendKeys(password);
    }

    @When("^I click on login button$")
    public void iClickLoginBtn() {
        driver.findElement(By.xpath(CONFIG.getProperty("AuthenticateBtn"))).click();
    }


    @When("^I validate Login failure$")
    public void iValidateLoginFailure() throws InterruptedException {
        String expected = driver.findElement(By.xpath(CONFIG.getProperty("FailureMsg"))).getText();
        boolean contains = expected.contains("Authentication failed!");
        Assert.assertTrue(contains, "Cannot verify login failure message");
        Thread.sleep(1000);
    }


}
