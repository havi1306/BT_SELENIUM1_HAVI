package testcases.password;

import common.Log;
import common.Random;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChangePasswordPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utils.BaseTest;
import utils.DriverUtils;

public class TC09_User_Can_Change_Password extends BaseTest {
    @Test
    public void TC09() {
        Log.info("TC09 - User can change password");
        Log.info("Pre-condition: Create and activate a new account");

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        RegisterPage registerPage = new RegisterPage();
        ChangePasswordPage changePasswordPage = new ChangePasswordPage();

        String validEmail = Random.getRandomEmail();
        String validPassword = Random.getRandomCharacters();
        String validConfirmPassword = validPassword;
        String validPID = Random.getRandomCharacters();
        String newPassword = Random.getRandomCharacters();

        DriverUtils.open();
        homePage.clickMenuTab("Register");
        registerPage.registerRailWay(validEmail, validPassword, validConfirmPassword, validPID);

        Log.info("1. Login with valid account");
        homePage.clickMenuTab("Login");
        loginPage.loginRailWay(validEmail, validPassword);
        DriverUtils.hardWait(500);

        Log.info("2. Click on 'Change Password' tab");
        homePage.clickMenuTab("Change password");

        Log.info("3. Enter valid value into all fields. and Click on 'Change Password' button");
        changePasswordPage.changePassword(validPassword, newPassword, newPassword);

        Log.info("Message 'Your password has been updated' appears.");
        String actualMgs = changePasswordPage.getChangePasswordMessage();
        String expectedMgs = Constants.SUCCESSFULLY_CHANGE_PASSWORD_MESSAGE;
        Assert.assertEquals(actualMgs,expectedMgs,"Your password has been updated!");
    }
}
