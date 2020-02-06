package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class Antiques extends CommonAPI {

    public Antiques() {

        PageFactory.initElements (driver, this);
    }

    public void AntiquePage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("furniture");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("20081");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
