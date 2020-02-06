package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class Crafts extends CommonAPI {

    public Crafts(){
        PageFactory.initElements(driver, this);

    }

    public void electronicsPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("gh-ac")).sendKeys("Color Book");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("14339");
        driver.findElement(By.id("gh-btn")).click();
    }
}


