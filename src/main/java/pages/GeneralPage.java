package pages;

import common.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage {

    // Locators

    String tabMenu = "//span[text()='%s']";
    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");

    protected WebElement getLblWelcomeMessage() {
        return Constants.WEBDRIVER.findElement(lblWelcomeMessage);
    }
    protected WebElement getTabMenu(String tabName){ return Constants.WEBDRIVER.findElement(By.xpath(String.format(tabMenu,tabName)));}

    // Methods
    public String getWelcomeMessage() {
        return this.getLblWelcomeMessage().getText();
    }



    public boolean isMenuTabDisplayed(String tabName) {
        try {
            return this.getTabMenu(tabName).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickMenuTab(String name){
        getTabMenu(name).click();
    }

}
