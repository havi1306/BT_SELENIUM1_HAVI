package pages;

import utils.DriverUtils;
import common.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPage {

    //Locators
    private final By txtUsername = By.xpath("//input[@id='username']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By btnLogin = By.xpath("//input[@value='login']");
    private final By lblMessageErrorLg = By.xpath("//p[@class='message error LoginForm']");

    // Elements

}
