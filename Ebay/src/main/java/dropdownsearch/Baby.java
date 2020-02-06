package dropdownsearch;


import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class Baby extends CommonAPI {


        public Baby() {

            PageFactory.initElements (driver, this);
        }

        public void BabyPage() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            driver.findElement (By.id ("gh-ac")).sendKeys ("diapers");
            Select s = new Select (driver.findElement (By.id ("gh-cat")));
            s.selectByValue ("2984");
            driver.findElement (By.id ("gh-btn")).click ();

        }
    }

