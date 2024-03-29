package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class MusicInstrument extends CommonAPI {

    public MusicInstrument(){
        PageFactory.initElements(driver, this);

    }

    public void musicInstrumentPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("gh-ac")).sendKeys("Guitar ");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("619");
        driver.findElement(By.id("gh-btn")).click();
    }
}

