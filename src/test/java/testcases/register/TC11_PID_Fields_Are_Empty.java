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

public class TC11_PID_Fields_Are_Empty extends BaseTest {
    @Test
    public void TC11(){
        Log.info("User can't create account while password and PID fields are empty");
        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();

        String validEmail = Random.getRandomEmail();
        String invalidPassword = "";
        String invalidConfirmPassword = invalidPassword;
        String invalidPID = "";

        Log.info("User can't create account with 'Confirm password' is not the same with 'Password'");
        Log.info("1. Navigate to QA Railway Website");
        homePage.open();

        Log.info("2. Click on 'Register' tab");
        homePage.clickMenuTab("Register");

        Log.info("3. Enter valid email address and leave other fields empty");
        Log.info("4. Click on 'Register' button");
        registerPage.registerRailWay(validEmail, invalidPassword, invalidConfirmPassword, invalidPID);
        DriverUtils.hardWait(1000);

        Log.info("Message 'There're errors in the form. Please correct the errors and try again.' appears above the form.");
        String actualMgs = registerPage.getRegisterErrorMessage();
        String expectedMgs = Constants.ERROR_REGISTER_MESSAGE;
        Assert.assertEquals(actualMgs,expectedMgs,"There're errors in the form. Please correct the errors and try again.");

        Log.info("Next to password fields, error message 'Invalid password length.' displays");
        String actualPasswordMsg = registerPage.getPasswordErrorMessage();
        String expectedPasswordMgs = Constants.ERROR_PASSWORD_MESSAGE;
        Assert.assertEquals(actualPasswordMsg,expectedPasswordMgs);

        Log.info("Next to PID field, error message 'Invalid ID length.' displays");
        String actualPIDMsg = registerPage.getPIDErrorMessage();
        String expectedPIDMgs = Constants.ERROR_PID_MESSAGE;
        Assert.assertEquals(actualPIDMsg,expectedPIDMgs);
    }
}
