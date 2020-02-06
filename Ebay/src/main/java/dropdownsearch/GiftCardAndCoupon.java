package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class GiftCardAndCoupon extends CommonAPI {

    public GiftCardAndCoupon(){
        PageFactory.initElements(driver, this);

    }

    public void GiftCardAndCoupon(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("gh-ac")).sendKeys("Macys Gift Card ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("172008");
        driver.findElement(By.id("gh-btn")).click();
    }
}


