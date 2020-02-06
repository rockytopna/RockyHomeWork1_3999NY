package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class CoinAndPaper extends CommonAPI {

    public CoinAndPaper() {

        PageFactory.initElements(driver, this);
    }

    public void coinPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("gh-ac")).sendKeys("worldMoney");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("11116");
        driver.findElement(By.id("gh-btn")).click();

    }

}