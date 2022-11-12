package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {
    private WebDriver driver = new ChromeDriver();

    /*public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }*/

    public WebDriver getDriver() {
        return driver;
    }
}