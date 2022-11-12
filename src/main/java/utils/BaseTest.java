package utils;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    private WebDriver driver;
    
    @Parameters(value={"browser"})
    public void preCondition(String browser) {
        WebDriver driver = LaunchBrowser.getDriver(browser);
        driver.setDriver(driver);
    }

    @AfterMethod
    public void postCondition(){
        // Quit the Browser
        Driver.quit();
    }
}
