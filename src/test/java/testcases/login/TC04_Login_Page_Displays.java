package testcases.login;

import common.Log;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;
import utils.DriverUtils;

public class TC04_Login_Page_Displays extends BaseTest {
    @Test
    public void TC04() {
        Log.info("Login page displays when un-logged User clicks on 'Book ticket' tab");
        HomePage homePage = new HomePage();

        Log.info("1. Navigate to QA Railway Website");
        DriverUtils.open();

        Log.info("2. Click on 'Book ticket' tab");
        homePage.clickMenuTab("Book ticket");

        Log.info("Login page displays instead of Book ticket page");
        Assert.assertEquals(DriverUtils.getPageTitle(), Constants.LOGIN_PAGE_TITLE);
    }
}
