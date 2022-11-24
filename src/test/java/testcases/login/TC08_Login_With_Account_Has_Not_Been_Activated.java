package testcases.login;

import common.Log;
import common.Random;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utils.BaseTest;
import utils.DriverUtils;

public class TC08_Login_With_Account_Has_Not_Been_Activated extends BaseTest {
    @Test
    public void TC08(){
        Log.info("TC08 - User can login with an account hasn't been activated");
        Log.info("Pre-condition: Create a new account but do not activate it");

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        RegisterPage registerPage = new RegisterPage();

        String validEmail = Random.getRandomEmail();
        String validPassword = Random.getRandomCharacters();
        String validConfirmPassword = validPassword;
        String validPID = Random.getRandomCharacters();

        homePage.open();
        homePage.clickMenuTab("Register");
        registerPage.registerRailWay(validEmail,validPassword,validConfirmPassword, validPID);

        Log.info("1. Navigate to QA Railway Website");
        Log.info("2. Click on 'Login' tab");
        homePage.clickMenuTab("Login");

        Log.info("3. Enter username and password of account hasn't been activated.");
        Log.info("4. Click on 'Login' button");
        loginPage.loginRailWay(validEmail, validPassword);
        DriverUtils.hardWait(500);

        Log.info("User is logged into Railway. Welcome user message is displayed.");
        String actualMsg = loginPage.getWelcomeMessage();
        String expectedMsg = "Welcome " + validEmail;
        Assert.assertEquals(actualMsg, expectedMsg);

    }
}
