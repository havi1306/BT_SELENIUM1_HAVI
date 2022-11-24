package testcases.login;

import common.Log;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;
import utils.DriverUtils;

public class TC01_Login_Successful extends BaseTest {

    @Test(description = "User can log into Railway with valid username and password")
    public void TC01() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        // Launch Chrome
        Log.info("1. Navigate to QA Railway Website");
        DriverUtils.open();

        Log.info("2. Click on 'Login' tab");
        homePage.clickMenuTab("Login");

        Log.info("3. Login with valid Email and Password");
        loginPage.loginRailWay(Constants.USERNAME, Constants.PASSWORD);

        Log.info("User is logged into Railway. Welcome user message is displayed.");
        String actualMsg = loginPage.getWelcomeMessage();
        String expectedMsg = "Welcome " + Constants.USERNAME;

        Assert.assertEquals(actualMsg, expectedMsg,
                "User is not logged and Welcome user message is not displayed");

        // Close Chrome
    }
}
