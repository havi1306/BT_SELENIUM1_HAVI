package testcases;

import common.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class TC01 {
    //User can log into Railway with valid username and password
    // open browser
    public static void main(String[] args) {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAPTOP\\IdeaProjects\\BT_SELENIUM1_HAVI\\src\\test\\resources\\Executables\\chromedriver107.exe");
        //WebDriver driver = new ChromeDriver();

        HomePage homePage = new HomePage();

        // 1. Navigate to QA Railway Website
        //driver.navigate().to(Constants.RAILWAY_URL);
        //driver.manage().window().maximize();

        // 2. Click on "Login" tab
        homePage.openHomepage();
        //homePage.clickBtnLogin();

        // 3. Enter valid Email and Password
        // 4. Click on "Login" button
        //loginPage.login(Constants.USERNAME, Constants.PASSWORD);
    }
}
