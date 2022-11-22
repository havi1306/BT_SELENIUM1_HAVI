package testcases.register;

import common.Log;
import common.Random;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import utils.BaseTest;
import utils.DriverUtils;

public class TC10_Confirm_Password extends BaseTest {
    @Test
    public void TC10(){

        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();

        String validEmail = Random.getRandomEmail();
        String validPassword = Random.getRandomCharacters();
        String invalidConfirmPassword = "";
        String validPID = Random.getRandomCharacters();

        Log.info("User can't create account with 'Confirm password' is not the same with 'Password'");
        Log.info("1. Navigate to QA Railway Website");
        homePage.open();

        Log.info("2. Click on 'Register' tab");
        homePage.clickMenuTab("Register");

        Log.info("3. Enter valid information into all fields except 'Confirm password' is not the same with 'Password'");
        Log.info("4. Click on 'Register' button");
        registerPage.registerRailWay(validEmail, validPassword, invalidConfirmPassword, validPID);
        DriverUtils.hardWait(1000);

        Log.info("Message 'There're errors in the form. Please correct the errors and try again.' appears.");
        String actualMgs = registerPage.getRegisterErrorMessage();
        String expectedMgs = Constants.ERROR_REGISTER_MESSAGE;
        Assert.assertEquals(actualMgs,expectedMgs,"There're errors in the form. Please correct the errors and try again.");

    }
}
