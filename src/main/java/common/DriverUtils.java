package common;

import common.constants.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DriverUtils {
    public static void hardWait(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (Exception e) {
            // pass
        }
    }

    public static void scrollToElement(WebElement webElement) {
        ((JavascriptExecutor) Constants.WEBDRIVER).executeScript("arguments[0].scrollIntoView(true);", webElement);
        hardWait(500);
    }
}
