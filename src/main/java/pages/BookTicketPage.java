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

    private WebElement getComboboxName(String listName) {
        return Constants.WEBDRIVER.findElement(By.xpath(String.format(comboboxName, listName)));
    }

    private WebElement getBookTicketMgs() {
        return Constants.WEBDRIVER.findElement(lblBookTicketMgs);
    }

    private WebElement getBookTicketButton() {
        return Constants.WEBDRIVER.findElement(btnBookTicket);
    }

    public void clickAndSelectDropdownListData1(String nameDdl, String dataTxt) {
        DriverUtils.scrollToElement(getComboboxName(nameDdl));
        Select selectDropdown = new Select(this.getComboboxName(nameDdl));
        selectDropdown.selectByVisibleText(dataTxt);
    }

    public void clickBookTicketButton(){
        this.getBookTicketButton().click();
    }

    public String getBookTicketMessage(){
        return this.getBookTicketMgs().getText();
    }

}
