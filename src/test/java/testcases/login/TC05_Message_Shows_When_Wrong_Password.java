package testcases.login;

import common.Log;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;
import utils.DriverUtils;

public class TC05_Message_Shows_When_Wrong_Password extends BaseTest {
    @Test
    public void TC05() {

        String invalidPass = "abc123456";
        Log.info("System shows message when user enters wrong password several times");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        Log.info("1. Navigate to QA Railway Website");
        DriverUtils.open();

        Log.info("2. Click on 'Login' tab");
        homePage.clickMenuTab("Login");

        Log.info("3. Login 3 three more times with valid information into 'Username' textbox except 'Password' textbox. .");

        for (int i = 0; i < 3; i++) {
            loginPage.loginRailWay(Constants.USERNAME, invalidPass);
        }

        Log.info("User can't login and message 'Invalid username or password. Please try again.' appears.");
        String actualMsg = loginPage.getErrorMessageLg();
        Assert.assertEquals(actualMsg,"Invalid username or password. Please try again.", "Step 5 failed");

    }
}
