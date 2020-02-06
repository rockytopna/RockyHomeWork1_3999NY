package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class ClothingPage extends CommonAPI {

    public ClothingPage (){

        PageFactory.initElements(driver, this);
    }
    public void ClothingPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement (By.id ("gh-ac")).sendKeys ("nike");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("11450");
        driver.findElement (By.id ("gh-btn")).click ();


    }

}
