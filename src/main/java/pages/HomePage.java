package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends NavigationPage {

    //Locators
    private WebElement btnLogin = getDriver().findElement(By.xpath("//a[contains(@href,'Account/Login')]"));


    // Methods
    public void clickBtnLogin() {
        btnLogin.click();
    }
}
