package common.constants;

import org.openqa.selenium.WebDriver;

public class Constants {
    public static WebDriver WEBDRIVER;
    public static final String RAILWAY_URL = "http://railway.somee.com/Page/HomePage.cshtml";
    public static final String USERNAME = "havi1306@yopmail.com";
    public static final String PASSWORD = "1234567890";
    public static final int DEFAULT_NUMBER_OF_CHARACTERS = 8;

    // Titles
    public static final String LOGIN_PAGE_TITLE = "Safe Railway - Login";
    public static final String MY_TICKET_PAGE_TITLE = "Safe Railway - My Ticket";
    public static final String CHANGE_PASSWORD_PAGE_TITLE = "Safe Railway - Change Password";

    // Message
    public static final String ERROR_LOGIN_MESSAGE =
            "There was a problem with your login and/or errors exist in your form.";
    public static final String SUCCESSFULLY_REGISTER_MESSAGE =
            "Registration Confirmed! You can now log in to the site.";
    public static final String SUCCESSFULLY_CHANGE_PASSWORD_MESSAGE =
            "Your password has been updated!";
    public static final String ERROR_REGISTER_MESSAGE =
            "There're errors in the form. Please correct the errors and try again.";
    public static final String ERROR_PASSWORD_MESSAGE =
            "Invalid password length";
    public static final String ERROR_PID_MESSAGE =
            "Invalid ID length";
    public static final String SUCCESSFULLY_BOOK_TICKET_MESSAGE =
            "Ticket booked successfully!";
}
