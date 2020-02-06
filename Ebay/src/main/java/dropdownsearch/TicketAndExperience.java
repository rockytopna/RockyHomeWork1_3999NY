package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class TicketAndExperience extends CommonAPI {

    public TicketAndExperience(){
        PageFactory.initElements(driver, this);

    }

    public void ticketExperience(){

        driver.findElement(By.id("gh-ac")).sendKeys(" NBA Tickets ");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("1305");
        driver.findElement(By.id("gh-btn")).click();
    }
}

