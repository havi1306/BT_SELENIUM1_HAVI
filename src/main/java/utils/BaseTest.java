package utils;

import common.constants.Constants;
import driver.LaunchDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    @BeforeMethod
    @Parameters(value={"browser"})
    public void beforeMethod(){
        System.out.println("Pre-Condition");
            LaunchDriver.getDriver("chrome");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Post-Condition");
        Constants.WEBDRIVER.quit();
    }
}
