package testcases.login;

import common.Log;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;

public class TC05_Message_Shows_When_Wrong_Password extends BaseTest {
    @Test
    public void TC05() {

        String invalidPass = "abc123456";
        Log.info("System shows message when user enters wrong password several times");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        Log.info("1. Navigate to QA Railway Website");
        homePage.open();

        Log.info("2. Click on 'Login' tab");
        homePage.clickLoginTab();

        Log.info("3. Enter valid information into 'Username' textbox except 'Password' textbox.");
        Log.info("4. Click on 'Login' button");
        Log.info("5. Repeat step 3 three more times.");

        for (int i = 0; i < 3; i++) {
            loginPage.loginRailWay(Constants.USERNAME, invalidPass);
        }

        Log.info("User can't login and message 'You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.' appears.");
        String actualMsg = loginPage.getErrorMessageLg();
        Assert.assertEquals(actualMsg,"You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.", "Step 5 failed");

    }
}
