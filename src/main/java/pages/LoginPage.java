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
    private WebElement getTxtUsername() {
        return Constants.WEBDRIVER.findElement(txtUsername);
    }

    private WebElement getTxtPassword() {
        return Constants.WEBDRIVER.findElement(txtPassword);
    }

    private WebElement getBtnLogin() {
        return Constants.WEBDRIVER.findElement(btnLogin);
    }

    private WebElement getLblMessageErrorLg(){
        return Constants.WEBDRIVER.findElement(lblMessageErrorLg);
    }

    // Methods
    public void loginRailWay(String username, String password) {
        DriverUtils.scrollToElement(getTxtUsername());
        this.getTxtUsername().clear();
        this.getTxtUsername().sendKeys(username);
        DriverUtils.scrollToElement(getTxtPassword());
        this.getTxtPassword().clear();
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
    }

    public String getErrorMessageLg(){
        return this.getLblMessageErrorLg().getText();
    }

}
