package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class SportingFanShop extends CommonAPI {

    public SportingFanShop() {
        PageFactory.initElements(driver, this);

    }

    public void sportingFanShop() {

        driver.findElement(By.id("gh-ac")).sendKeys("BaseBall Cards");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("64482");
        driver.findElement(By.id("gh-btn")).click();
    }
}

