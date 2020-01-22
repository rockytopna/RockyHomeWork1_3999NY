package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {


    @Test
    public void clickDaliyDealTest1() throws InterruptedException {
        driver.findElement(By.className("gh-p")).click();
        Thread.sleep(2000);

    }

    @Test
    public void iphoneSearchTest2() throws InterruptedException {
        System.out.println(driver.getTitle());
        typeOnElement("gh-ac", "iPhone");
        clickOnElement("gh-btn");
        Thread.sleep(2000);

    }

    @Test
    public void motorSectonTest3()throws InterruptedException {
        driver.findElement(By.cssSelector(".hl-cat-nav__container > li:nth-of-type(3) > a")).click();
        Thread.sleep(2000);
    }

    @Test
    public void findallPartsTest4()throws InterruptedException{
        motorSectonTest3();
        clickOnElement("//a[contains(text(),'All Parts & Accessories')]");
        Thread.sleep(2000);

    }


}




