package testcases;

import com.github.javafaker.Faker;
import common.Log;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import utils.BaseTest;

public class TC07 extends BaseTest {
    @Test
    public void TC07() {
        Faker faker = new Faker();

        String validEmail = faker.internet().emailAddress();
        String validPassword = "1234567890";
        String validConfirmPassword = "1234567890";
        int validPID = 12345678;

        Log.info("User can create new account");
        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();

        Log.info("1. Navigate to QA Railway Website");
        homePage.open();
        Log.info("2. Click on 'Register' tab");
        homePage.clickRegisterTab();

        Log.info("3. Enter valid information into all fields");
        Log.info("4. Click on 'Register' button");
        registerPage.registerRailWay(validEmail, validPassword, validConfirmPassword, validPID);

        Log.info("New account is created and message 'Thank you for registering your account' appears.");
        Assert.assertEquals(registerPage.getRegisterMessage(), Constants.SUCCESSFULLY_REGISTER_MESSAGE);
    }
}
