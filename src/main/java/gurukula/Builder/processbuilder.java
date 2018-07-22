package gurukula.Builder;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class processbuilder {

    public static Properties CONFIG = new Properties();
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void loadProperties(String prop) throws IOException {
        CONFIG.load(new FileInputStream(
                System.getProperty("user.dir") + "\\src\\main\\java\\gurukula\\PageObjects\\"+prop));
    }

    public static void setupDriver() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
    }

    public static void teardown(){
        driver.close();
    }

    public static void takeScreenshot() throws Exception {
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot, new File(System.getProperty("user.dir") +
                "\\target"));
    }
}
