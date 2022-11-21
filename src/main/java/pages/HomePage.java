package pages;

import common.constants.Constants;

public class HomePage extends GeneralPage {

    //Locators
    // Elements
    // Methods
    public void open(){
        Constants.WEBDRIVER.navigate().to(Constants.RAILWAY_URL);
    }
}
