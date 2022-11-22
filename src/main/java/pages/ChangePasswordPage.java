package pages;

import common.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage extends GeneralPage {

    private final By txtCurrentPassword = By.id("currentPassword");
    private final By txtNewPassword = By.id("newPassword");
    private final By txtConfirmPassword = By.id("confirmPassword");
    private final By btnChangePassword = By.xpath("//input[@value='Change Password']");
    private final By lblChangePasswordMgs = By.xpath("//p[@class='message success']");

    private WebElement getCurrentPasswordTxt() {
        return Constants.WEBDRIVER.findElement(txtCurrentPassword);
    }

    private WebElement getNewPasswordTxt() {
        return Constants.WEBDRIVER.findElement(txtNewPassword);
    }

    private WebElement getConfirmPasswordTxt() {
        return Constants.WEBDRIVER.findElement(txtConfirmPassword);
    }

    private WebElement getChangePasswordBtn(){
        return Constants.WEBDRIVER.findElement(btnChangePassword);
    }

    private WebElement getChangePasswordMgs(){
        return Constants.WEBDRIVER.findElement(lblChangePasswordMgs);
    }

    public void changePassword(String currentPassword, String newPassword, String confirmPassword){
        this.getCurrentPasswordTxt().sendKeys(currentPassword);
        this.getNewPasswordTxt().sendKeys(newPassword);
        this.getConfirmPasswordTxt().sendKeys(confirmPassword);
        this.getChangePasswordBtn().click();
    }

    public String getChangePasswordMessage(){
        return this.getChangePasswordMgs().getText();
    }
}
