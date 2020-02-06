package test;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends CommonAPI {

    @Test
    public void bookTicketTest1()throws InterruptedException {
        typeOnElement("input#reservationFlightSearchForm\\.originAirport","JFK");
        typeOnElement("/html//input[@id='reservationFlightSearchForm.destinationAirport']","GRR");
        Thread.sleep(1000);
    }

    @Test (enabled = false)
    public void dropDownTest2() throws InterruptedException {
        bookTicketTest1();
        Select dropDown = new Select (driver.findElement(By.name("adultOrSeniorPassengerCount")));
        dropDown.selectByValue("2");
    Thread.sleep(1000);


    }
}
