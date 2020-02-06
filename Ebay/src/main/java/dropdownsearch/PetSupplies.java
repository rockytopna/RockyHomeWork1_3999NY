package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class PetSupplies extends CommonAPI {

    public PetSupplies(){
        PageFactory.initElements(driver, this);

    }

    public void petSuppliesPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("gh-ac")).sendKeys("Cat Food");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("1281");
        driver.findElement(By.id("gh-btn")).click();
    }
}

