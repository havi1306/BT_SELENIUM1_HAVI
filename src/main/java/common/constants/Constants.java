package common.constants;

import org.openqa.selenium.WebDriver;

public class Constants {
    public static WebDriver WEBDRIVER;
    public static final String RAILWAY_URL = "http://railway.somee.com/Page/HomePage.cshtml";
    public static final String USERNAME = "havi1306@gmail.com";
    public static final String PASSWORD = "1234567890";

    // Titles
    public static final String LOGIN_PAGE_TITLE = "Safe Railway - Login";
    public static final String MY_TICKET_PAGE_TITLE = "Safe Railway - My Ticket";
    public static final String CHANGE_PASSWORD_PAGE_TITLE = "Safe Railway - Change Password";

    // Message
    public static final String ERROR_LOGIN_MESSAGE =
            "There was a problem with your login and/or errors exist in your form.";
    public static final String SUCCESSFULLY_REGISTER_MESSAGE =
            "Thank you for registering your account";
}
