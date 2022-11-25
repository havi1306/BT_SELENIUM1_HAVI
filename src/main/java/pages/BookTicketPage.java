package pages;

import common.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.DriverUtils;

public class BookTicketPage extends GeneralPage {

    String comboboxName = "//select[@name='%s']";
    private final By btnBookTicket = By.xpath("//input[@value='Book ticket']");
    private final By lblBookTicketMgs = By.xpath("//div[@id='content']/h1");

}
