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

public class TC14_User_Can_Book_Ticket extends BaseTest {
    @Test(description = "User can book 1 ticket at a time")
    public void TC14(){

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

        homePage.open();
        Log.info("Pre-condition: Create and activate a new account");
        homePage.clickMenuTab("Register");
        registerPage.registerRailWay(validEmail, validPassword, validConfirmPassword, validPID);

        Log.info("1. Login with a valid account ");
        homePage.clickMenuTab("Login");
        loginPage.loginRailWay(validEmail,validPassword);

        Log.info("2. Click on 'Book ticket' tab");
        homePage.clickMenuTab("Book ticket");

        Log.info("3. Select a 'Depart date' from the list");
        bookTicketPage.clickAndSelectDropdownListData1("Date",date);

        Log.info("4. Select 'HUế' for 'Depart from' and 'Đà Nẵng' for 'Arrive at'.");
        bookTicketPage.clickAndSelectDropdownListData1("DepartStation",departStation);
        bookTicketPage.clickAndSelectDropdownListData1("ArriveStation",arriveStation);

        Log.info("5. Select 'Soft seat with air conditioner' for 'Seat type'");
        bookTicketPage.clickAndSelectDropdownListData1("SeatType",seatType);

        Log.info("6. Select '1' for 'Ticket amount'");
        bookTicketPage.clickAndSelectDropdownListData1("TicketAmount",ticketAmount);

        Log.info("7. Click on 'Book ticket' button");
        bookTicketPage.clickBookTicketButton();

        Log.info("Message 'Ticket booked successfully!' displays. Ticket information display correctly (Depart Date,  Depart Station,  Arrive Station,  Seat Type,  Amount)");
        String actualBookTicketMgs = bookTicketPage.getBookTicketMessage();
        String expectedBookTicketMgs = Constants.SUCCESSFULLY_BOOK_TICKET_MESSAGE;
        Assert.assertEquals(actualBookTicketMgs,expectedBookTicketMgs);
    }
}
