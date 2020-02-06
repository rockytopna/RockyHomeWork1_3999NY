package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class HomeAndGargen extends CommonAPI {

    public HomeAndGargen(){
        PageFactory.initElements(driver, this);

    }

    public void homeAndGargen(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("gh-ac")).sendKeys("Out Door Camera");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("11700");
        driver.findElement(By.id("gh-btn")).click();
    }
}


