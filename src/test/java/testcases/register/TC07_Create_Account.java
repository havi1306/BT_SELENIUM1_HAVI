package testcases.register;

import com.github.javafaker.Faker;
import common.Log;
import common.Random;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import utils.BaseTest;
import utils.DriverUtils;

public class TC07_Create_Account extends BaseTest {
    @Test(description = "User can create new account")
    public void TC07() {

        String validEmail = Random.getRandomEmail();
        String validPassword = Random.getRandomCharacters();
        String validConfirmPassword = validPassword;
        String validPID = Random.getRandomCharacters();

        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();

        DriverUtils.open();
        Log.info("1. Click on 'Register' tab");
        homePage.clickMenuTab("Register");

        Log.info("2. Enter valid information into all fields and Click on 'Register' button");
        registerPage.registerRailWay(validEmail, validPassword, validConfirmPassword, validPID);

        Log.info("New account is created and message 'Thank you for registering your account' appears.");
        Assert.assertEquals(registerPage.getRegisterMessage(), Constants.SUCCESSFULLY_REGISTER_MESSAGE);
    }
}
