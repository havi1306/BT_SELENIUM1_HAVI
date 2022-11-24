package testcases.login;

import common.Log;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;
import utils.DriverUtils;

public class TC03_Login_With_Invalid_Password extends BaseTest {
    @Test(description = "User cannot log into Railway with invalid password ")
    public void TC03() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        Log.info("1. Navigate to QA Railway Website");
        DriverUtils.open();

        Log.info("2. Click on 'Login' tab");
        homePage.clickMenuTab("Login");

        Log.info("3.Login with valid Email and invalid Password");
        loginPage.loginRailWay(Constants.USERNAME, "");

        Log.info("Error message 'There was a problem with your login and/or errors exist in your form.' is displayed");
        String actualMsg = loginPage.getErrorMessageLg();
        Assert.assertEquals(actualMsg, Constants.ERROR_LOGIN_MESSAGE);
    }
}
