package testcases.login;

import common.Log;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChangePasswordPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyTicketPage;
import utils.BaseTest;
import utils.DriverUtils;

public class TC06_Additional_Pages_Display extends BaseTest {
    @Test
    public void TC06(){
        Log.info("Additional pages display once user logged in");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyTicketPage myTicketPage = new MyTicketPage();
        ChangePasswordPage changePasswordPage = new ChangePasswordPage();

        Log.info("1. Navigate to QA Railway Website");
        DriverUtils.open();

        Log.info("2. Click on 'Login' tab");
        homePage.clickMenuTab("Login");

        Log.info("3. Login with valid account");
        loginPage.loginRailWay(Constants.USERNAME, Constants.PASSWORD);
        DriverUtils.hardWait(1000);

        Log.info("'My ticket', 'Change password' and 'Logout' tabs are displayed.");
        Assert.assertTrue(homePage.isMenuTabDisplayed("My ticket"));
        Assert.assertTrue(homePage.isMenuTabDisplayed("Change password"));
        Assert.assertTrue(homePage.isMenuTabDisplayed("Log out"));

        Log.info("Click 'My ticket' tab, user will be directed to My ticket page");
        homePage.clickMenuTab("My ticket");
        Assert.assertEquals(DriverUtils.getPageTitle(),Constants.MY_TICKET_PAGE_TITLE);

        Log.info("Click 'Change password' tab, user will be directed to Change password page");
        homePage.clickMenuTab("Change password");
        Assert.assertEquals(DriverUtils.getPageTitle(),Constants.CHANGE_PASSWORD_PAGE_TITLE);
    }
}
