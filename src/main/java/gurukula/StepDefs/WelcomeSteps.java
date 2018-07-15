package gurukula.StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

import static gurukula.Builder.processbuilder.*;

public class WelcomeSteps {

    @Given("^I navigate to Gurukula home page$")
    public void iNavigateToGurukulaLoginPage() throws IOException {
        setupDriver();
        loadProperties("WelcomePage.properties");
        driver.get(CONFIG.getProperty("welcomeURL"));
        driver.manage().window().maximize() ;
    }

    @And("^I click on link to Login page$")
    public void iClickOnLogin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONFIG.getProperty("loginBtn"))));
        driver.findElement(By.xpath(CONFIG.getProperty("loginBtn"))).click();
    }

    @And("^I click on link to Register new user page$")
    public void iClickOnRegisterUser() throws InterruptedException {
        driver.findElement(By.xpath(CONFIG.getProperty("RegisterBtn"))).click();
        Thread.sleep(1000);
    }

    @Then("^I close the browser$")
    public void i_close_the_browser() {
        teardown();
    }

}
