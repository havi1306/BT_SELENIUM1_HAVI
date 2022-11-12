package driver;

import common.constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static void open(String browser) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAPTOP\\IdeaProjects\\BT_SELENIUM1_HAVI\\src\\test\\resources\\Executables\\chromedriver107.exe");
        Constants.WEBDRIVER = new ChromeDriver();
        Constants.WEBDRIVER.manage().window().maximize();
    }

    public static void navigateToUrl(String url) {
        Constants.WEBDRIVER.navigate().to(url);
    }
}
