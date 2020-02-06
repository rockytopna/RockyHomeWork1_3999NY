package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class PotteryAndGlass extends CommonAPI {

    public PotteryAndGlass(){
        PageFactory.initElements(driver, this);

    }

    public void potteryAndGlass(){
        driver.findElement(By.id("gh-ac")).sendKeys(" Flower Vase ");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("870");
        driver.findElement(By.id("gh-btn")).click();
    }
}

