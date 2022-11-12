package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    //Locators
    private By txtUsername = By.xpath("//input[@id='username']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@value='login']");
    private By lblMessageErrorLg = By.xpath("//p[@class='message error LoginForm']");

    // Elements
    private WebElement getTxtUsername() {
        return driver.findElement(txtUsername);
    }

    private WebElement getTxtPassword() {
        return driver.findElement(txtPassword);
    }

    private WebElement getBtnLogin() {
        return driver.findElement(btnLogin);
    }

    private WebElement getLblMessageErrorLg() {
        return driver.findElement(lblMessageErrorLg);
    }

    // Methods
    public void login(String username, String password){
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
    }
}
