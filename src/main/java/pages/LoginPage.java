package pages;

import common.DriverUtils;
import common.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPage {

    //Locators
    private By txtUsername = By.xpath("//input[@id='username']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@value='login']");
    private By lblMessageErrorLg = By.xpath("//p[@class='message error LoginForm']");

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

    // Methods
    public void loginRailWay(String username, String password) {
        DriverUtils.scrollToElement(getTxtUsername());
        this.getTxtUsername().sendKeys(username);
        DriverUtils.scrollToElement(getTxtPassword());
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
    }

}
