package testcases.ticket;

import common.Log;
import common.Random;
import common.constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BookTicketPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utils.BaseTest;
import utils.DriverUtils;

public class TC14_User_Can_Book_Ticket extends BaseTest {
    @Test
    public void TC14(){
        Log.info("User can book 1 ticket at a time");
        Log.info("Pre-condition: Create and activate a new account");
        String validEmail = Random.getRandomEmail();
        String validPassword = Random.getRandomCharacters();
        String validConfirmPassword = validPassword;
        String validPID = Random.getRandomCharacters();

        // Ticket info
        String date = "11/30/2022";
        String departStation = "Huế";
        String arriveStation = "Đà Nẵng";
        String seatType = "Soft seat with air conditioner";
        String ticketAmount = "1";


        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        RegisterPage registerPage = new RegisterPage();
        BookTicketPage bookTicketPage = new BookTicketPage();

        Log.info("1. Navigate to QA Railway Website and create an account");
        homePage.open();
        homePage.clickMenuTab("Register");
        registerPage.registerRailWay(validEmail, validPassword, validConfirmPassword, validPID);

        Log.info("2. Login with a valid account ");
        homePage.clickMenuTab("Login");
        loginPage.loginRailWay(validEmail,validPassword);

        Log.info("3. Click on 'Book ticket' tab");
        homePage.clickMenuTab("Book ticket");

        Log.info("4. Select a 'Depart date' from the list");
        bookTicketPage.clickAndSelectDropdownListData("Date",date);

        Log.info("5. Select 'HUế' for 'Depart from' and 'Đà Nẵng' for 'Arrive at'.");
        bookTicketPage.clickAndSelectDropdownListData("DepartStation",departStation);
        bookTicketPage.clickAndSelectDropdownListData("ArriveStation",arriveStation);

        Log.info("6. Select 'Soft seat with air conditioner' for 'Seat type'");
        bookTicketPage.clickAndSelectDropdownListData("SeatType",seatType);

        Log.info("7. Select '1' for 'Ticket amount'");
        bookTicketPage.clickAndSelectDropdownListData("TicketAmount",ticketAmount);

        Log.info("8. Click on 'Book ticket' button");
        bookTicketPage.clickBookTicketButton();

        Log.info("Message 'Ticket booked successfully!' displays. Ticket information display correctly (Depart Date,  Depart Station,  Arrive Station,  Seat Type,  Amount)");
        String actualBookTicketMgs = bookTicketPage.getBookTicketMessage();
        String expectedBookTicketMgs = Constants.SUCCESSFULLY_BOOK_TICKET_MESSAGE;
        Assert.assertEquals(actualBookTicketMgs,expectedBookTicketMgs);
    }
}
