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
    private WebElement getEmailTxt(){
        return Constants.WEBDRIVER.findElement(txtEmail);
    }

    private WebElement getPasswordTxt(){
        return Constants.WEBDRIVER.findElement(txtPassword);
    }

    private WebElement getConfirmPasswordTxt(){
        return Constants.WEBDRIVER.findElement(txtConfirmPassword);
    }

    private WebElement getPIDTxt(){
        return Constants.WEBDRIVER.findElement(txtPID);
    }

    private WebElement getRegisterBtn(){
        return Constants.WEBDRIVER.findElement(btnRegister);
    }

    private WebElement getLblRegisterMgs(){
        return Constants.WEBDRIVER.findElement(lblRegisterMessage);
    }

    private WebElement getRegisterErrorMgs(){
        return Constants.WEBDRIVER.findElement(lblRegisterErrorMessage);
    }

    private WebElement getPasswordErrorMgs(){
        return Constants.WEBDRIVER.findElement(lblPasswordErrorMessage);
    }

    private WebElement getPIDErrorMgs(){
        return Constants.WEBDRIVER.findElement(lblPIDErrorMessage);
    }
    public void registerRailWay(String email, String password, String confirmPassword, String PID){
        DriverUtils.scrollToElement(getEmailTxt());
        this.getEmailTxt().sendKeys(email);
        this.getPasswordTxt().sendKeys(password);
        this.getConfirmPasswordTxt().sendKeys(confirmPassword);
        this.getPIDTxt().sendKeys(PID);
        DriverUtils.scrollToElement(getRegisterBtn());
        this.getRegisterBtn().click();
    }

    public String getRegisterMessage(){
        return this.getLblRegisterMgs().getText();
    }

    public String getRegisterErrorMessage(){
        return this.getRegisterErrorMgs().getText();
    }

    public String getPasswordErrorMessage(){ return this.getPasswordErrorMgs().getText();}

    public String getPIDErrorMessage(){ return this.getPIDErrorMgs().getText();}
}
