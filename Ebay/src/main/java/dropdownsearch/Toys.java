package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class Toys extends CommonAPI {

    public Toys(){
        PageFactory.initElements(driver, this);

    }

    public void toysPage(){

        driver.findElement(By.id("gh-ac")).sendKeys(" BatMan ");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("220");
        driver.findElement(By.id("gh-btn")).click();
    }
}

