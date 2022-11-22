package testcases.login;

import common.Log;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;

public class TC02_Login_With_Blank_Username extends BaseTest {
    @Test
    public void TC02() {
        Log.info("User can't login with blank 'Username' textbox");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        Log.info("1. Navigate to QA Railway Website");
        homePage.open();

        Log.info("2. Click on 'Login' tab");
        homePage.clickMenuTab("Login");

        Log.info("3. User doesn't type any words into 'Username' textbox but enter valid information into 'Password' textbox ");
        Log.info("4. Click on 'Login' button");
        loginPage.loginRailWay("", Constants.PASSWORD);

        Log.info("User can't login and message 'There was a problem with your login and/or errors exist in your form.' appears.");
        String actualMsg = loginPage.getErrorMessageLg();
        Assert.assertEquals(actualMsg, Constants.ERROR_LOGIN_MESSAGE);
    }
}
