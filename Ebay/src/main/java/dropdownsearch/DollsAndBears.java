package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class DollsAndBears extends CommonAPI {

    public DollsAndBears(){
        PageFactory.initElements(driver, this);

    }

    public void dollsAndBearsPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("gh-ac")).sendKeys("BarbieDall ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("237");
        driver.findElement(By.id("gh-btn")).click();
    }
}


