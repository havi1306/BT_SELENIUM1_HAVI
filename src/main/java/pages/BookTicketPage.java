package pages;

import common.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverUtils;

public class BookTicketPage extends GeneralPage {

    String ddlName = "//select[@name='%s']";
    String txtData = "//option[text()='%s']";

    private final By btnBookTicket = By.xpath("//input[@value='Book ticket']");
    private final By lblBookTicketMgs = By.xpath("//div[@id='content']/h1");

    private WebElement getDropdownListName(String listName) {
        return Constants.WEBDRIVER.findElement(By.xpath(String.format(ddlName, listName)));
    }

    private WebElement getData(String dataText) {
        return Constants.WEBDRIVER.findElement(By.xpath(String.format(txtData, dataText)));
    }

    private WebElement getBookTicketMgs() {
        return Constants.WEBDRIVER.findElement(lblBookTicketMgs);
    }

    private WebElement getBookTicketButton() {
        return Constants.WEBDRIVER.findElement(btnBookTicket);
    }

    public void clickAndSelectDropdownListData(String nameDdl, String dataTxt) {
        DriverUtils.scrollToElement(getDropdownListName(nameDdl));
        this.getDropdownListName(nameDdl).click();
        this.getData(dataTxt).click();
    }

    public void clickBookTicketButton(){
        this.getBookTicketButton().click();
    }

    public String getBookTicketMessage(){
        return this.getBookTicketMgs().getText();
    }

}
