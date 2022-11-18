package testcases;

import common.Log;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;

public class TC03 extends BaseTest {
    @Test
    public void TC03() {
        Log.info("User cannot log into Railway with invalid password ");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        Log.info("1. Navigate to QA Railway Website");
        homePage.open();

        Log.info("2. Click on 'Login' tab");
        homePage.clickLoginTab();

        Log.info("3. Enter valid Email and invalid Password");
        Log.info("4. Click on 'Login' button");
        loginPage.loginRailWay(Constants.USERNAME, "");

        Log.info("Error message 'There was a problem with your login and/or errors exist in your form.' is displayed");
        String actualMsg = loginPage.getErrorMessageLg();
        Assert.assertEquals(actualMsg, Constants.ERROR_LOGIN_MESSAGE);
    }
}
