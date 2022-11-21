package pages;

import common.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage {

    // Locators
    private final By tabLogin = By.xpath("//span[text()='Login']");
    private final By tabLogout = By.xpath("//span[text()='Logout']");
    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");

    // Elements
    protected WebElement getTabLogin() {
        return Constants.WEBDRIVER.findElement(tabLogin);
    }

    protected WebElement getTabLogout() {
        return Constants.WEBDRIVER.findElement(tabLogout);
    }

    protected WebElement getLblWelcomeMessage(){
        return Constants.WEBDRIVER.findElement(lblWelcomeMessage);
    }

    // Methods
    public String getWelcomeMessage(){
        return this.getLblWelcomeMessage().getText();
    }

    public void clickLoginTab(){
        this.getTabLogin().click();
    }
}
