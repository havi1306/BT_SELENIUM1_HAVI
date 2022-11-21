package testcases.login;

import common.Log;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;

public class TC04_Login_Page_Displays extends BaseTest {
    @Test
    public void TC04() {
        Log.info("Login page displays when un-logged User clicks on 'Book ticket' tab");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        Log.info("1. Navigate to QA Railway Website");
        homePage.open();

        Log.info("2. Click on 'Book ticket' tab");
        homePage.clickBookTicketTab();

        Log.info("Login page displays instead of Book ticket page");
        Assert.assertEquals(loginPage.getPageTitle(), Constants.LOGIN_PAGE_TITLE);
    }
}
