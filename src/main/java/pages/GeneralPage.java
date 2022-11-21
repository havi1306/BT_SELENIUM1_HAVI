package pages;

import common.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage {

    // Locators
    private final By tabLogin = By.xpath("//span[text()='Login']");
    private final By tabLogout = By.xpath("//span[text()='Log out']");
    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");
    private final By tabBookTicket = By.xpath("//span[text()='Book ticket']");
    private final By tabMyTicket = By.xpath("//span[text()='My ticket']");
    private final By tabRegister = By.xpath("//span[text()='Register']");
    private final By tabChangePassword = By.xpath("//span[text()='Change password']");

    // Elements
    protected WebElement getTabLogin() {
        return Constants.WEBDRIVER.findElement(tabLogin);
    }

    protected WebElement getTabLogout() {
        return Constants.WEBDRIVER.findElement(tabLogout);
    }

    protected WebElement getTabBookTicket() {
        return Constants.WEBDRIVER.findElement(tabBookTicket);
    }

    protected WebElement getTabChangePassword() {
        return Constants.WEBDRIVER.findElement(tabChangePassword);
    }

    protected WebElement getLblWelcomeMessage() {
        return Constants.WEBDRIVER.findElement(lblWelcomeMessage);
    }

    protected WebElement getTabMyTicket() {
        return Constants.WEBDRIVER.findElement(tabMyTicket);
    }
    protected WebElement getTabRegister() {
        return Constants.WEBDRIVER.findElement(tabRegister);
    }

    // Methods
    public String getWelcomeMessage() {
        return this.getLblWelcomeMessage().getText();
    }

    public void clickLoginTab() {
        this.getTabLogin().click();
    }

    public void clickBookTicketTab() {
        this.getTabBookTicket().click();
    }

    public String getPageTitle() {
        return Constants.WEBDRIVER.getTitle();
    }

    public boolean isMyTicketTabDisplayed() {
        return this.getTabMyTicket().isDisplayed();
    }

    public boolean isChangePasswordTabDisplayed() {
        return this.getTabChangePassword().isDisplayed();
    }

    public boolean isLogoutTabDisplayed() {
        return this.getTabLogout().isDisplayed();
    }

    public void clickMyTicketTab() {
        this.getTabMyTicket().click();
    }

    public void clickChangePassword() {
        this.getTabChangePassword().click();
    }

    public void clickRegisterTab(){
        this.getTabRegister().click();
    }
}
