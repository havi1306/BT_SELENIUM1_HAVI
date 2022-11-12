package pages;

import common.constants.Constants;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
public class NavigationPage extends BasePage {

    /*public NavigationPage(WebDriver driver) {
        super(driver);
    }*/


    public void openHomepage() {
        getDriver().get(Constants.RAILWAY_URL);
    }

    /*public void openUrl(String url) {
        Driver.getDriver().get(url);
    }*/
}
