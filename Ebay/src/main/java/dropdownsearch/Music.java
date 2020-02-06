package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class Music extends CommonAPI {

    public Music(){
        PageFactory.initElements(driver, this);

    }

    public void musicPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("gh-ac")).sendKeys(" Back Street Boys ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("11233");
        driver.findElement(By.id("gh-btn")).click();
    }
}

