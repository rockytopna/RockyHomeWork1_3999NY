package opennewtab;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class NewTab extends CommonAPI {

    public NewTab(){
        PageFactory.initElements(driver, this);

    }
            public void newWindow() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.ebay.com/");
            driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
            driver.get("https://www.ebay.com/help/home");

     }
    }



