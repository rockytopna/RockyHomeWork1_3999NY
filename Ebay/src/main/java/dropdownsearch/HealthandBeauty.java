package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class HealthandBeauty extends CommonAPI {

    public HealthandBeauty(){
        PageFactory.initElements(driver, this);

    }

    public void healthAndBeautyPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("gh-ac")).sendKeys("Neutrogena");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("26395");
        driver.findElement(By.id("gh-btn")).click();
    }
}

