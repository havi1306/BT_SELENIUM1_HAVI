package testcases.login;

import common.Log;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;

public class TC01_Login_Successful extends BaseTest {

    @Test
    public void TC01() {
        Log.info("TC01: User can log into Railway with valid username and password");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        // Launch Chrome
        Log.info("1. Navigate to QA Railway Website");
        homePage.open();

        Log.info("2. Click on 'Login' tab");
        homePage.clickMenuTab("Login");

        Log.info("3. Enter valid Email and Password");
        Log.info("4. Click on 'Login' button");
        loginPage.loginRailWay(Constants.USERNAME, Constants.PASSWORD);

        Log.info("User is logged into Railway. Welcome user message is displayed.");
        String actualMsg = loginPage.getWelcomeMessage();
        String expectedMsg = "Welcome " + Constants.USERNAME;

        Assert.assertEquals(actualMsg, expectedMsg,
                "User is not logged and Welcome user message is not displayed");

        // Close Chrome
    }
}
