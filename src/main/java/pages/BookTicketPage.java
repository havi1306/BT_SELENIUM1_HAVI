package pages;

import common.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.DriverUtils;

public class BookTicketPage extends GeneralPage {

    String comboboxName = "//select[@name='%s']";
    String textOption = "//select[@name='%s']//option[text()='%s']";
    Select selectByValue = new Select(Constants.WEBDRIVER.findElement(By.xpath(String.format(comboboxName))));
    private final By btnBookTicket = By.xpath("//input[@value='Book ticket']");
    private final By lblBookTicketMgs = By.xpath("//div[@id='content']/h1");

    private WebElement getComboboxName(String listName) {
        return Constants.WEBDRIVER.findElement(By.xpath(String.format(comboboxName, listName)));
    }

    private WebElement getTextOption(String optionText) {
        return Constants.WEBDRIVER.findElement(By.xpath(String.format(textOption, optionText)));
    }

    private WebElement getBookTicketMgs() {
        return Constants.WEBDRIVER.findElement(lblBookTicketMgs);
    }

    private WebElement getBookTicketButton() {
        return Constants.WEBDRIVER.findElement(btnBookTicket);
    }

//    public void clickAndSelectDropdownListData(String nameDdl, String dataTxt) {
//        DriverUtils.scrollToElement(getComboboxName(nameDdl));
//        this.getComboboxName(nameDdl).click();
//        this.getTextOption(dataTxt).click();
//    }

    public void clickBookTicketButton(){
        this.getBookTicketButton().click();
    }

    public String getBookTicketMessage(){
        return this.getBookTicketMgs().getText();
    }

    public void clickOnDropdown(String name) {
        DriverUtils.scrollToElement(getComboboxName(name));
        this.getTextOption(name).click();
    }

    public void selectByValue(String name, String value){
        clickOnDropdown(name);
        selectByValue.selectByValue(value);
    }

}
