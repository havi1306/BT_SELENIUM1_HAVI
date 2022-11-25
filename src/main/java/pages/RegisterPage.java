package pages;

import common.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverUtils;

public class RegisterPage extends GeneralPage{

    private final By txtEmail = By.id("email");
    private final By txtPassword = By.id("password");
    private final By txtConfirmPassword = By.id("confirmPassword");
    private final By txtPID = By.id("pid");
    private final By btnRegister = By.xpath("//input[@value='Register']");
    private final By lblRegisterMessage = By.xpath("//div[@id='content']/p");
    private final By lblRegisterErrorMessage = By.xpath("//p[@class='message error']");
    private final By lblPasswordErrorMessage = By.xpath("//li[@class='password']/label[@class='validation-error']");
    private final By lblPIDErrorMessage = By.xpath("//li[@class='pid-number']/label[@class='validation-error']");

}
