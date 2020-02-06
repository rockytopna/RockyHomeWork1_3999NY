package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class RealEstate extends CommonAPI {

    public RealEstate(){
        PageFactory.initElements(driver, this);

    }

    public void realEstate(){
        driver.findElement(By.id("gh-ac")).sendKeys(" House for rent");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("10542");
        driver.findElement(By.id("gh-btn")).click();
    }
}

