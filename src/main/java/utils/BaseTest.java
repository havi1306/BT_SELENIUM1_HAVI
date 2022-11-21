package utils;

import common.constants.Constants;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-Condition");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAPTOP\\IdeaProjects\\BT_SELENIUM1_HAVI\\src\\test\\resources\\Executables\\chromedriver107.exe");
        Constants.WEBDRIVER = new ChromeDriver();
        Constants.WEBDRIVER.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Post-Condition");
        Constants.WEBDRIVER.quit();
    }
}
