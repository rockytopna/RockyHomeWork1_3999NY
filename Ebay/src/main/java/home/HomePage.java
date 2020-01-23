package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {


    @Test(enabled = false)
    public void clickDaliyDealTest1() throws InterruptedException {
        driver.findElement(By.className("gh-p")).click();
        Thread.sleep(2000);

    }

    @Test(enabled = false)
    public void iphoneSearchTest2() throws InterruptedException {
        System.out.println(driver.getTitle());
        typeOnElement("gh-ac", "iPhone");
        clickOnElement("gh-btn");
        Thread.sleep(2000);

    }

    @Test(enabled = false)
    public void motorSectonTest3() throws InterruptedException {
        driver.findElement(By.cssSelector(".hl-cat-nav__container > li:nth-of-type(3) > a")).click();
        Thread.sleep(2000);
    }

    @Test (enabled = false)
    public void findallPartsTest4() throws InterruptedException {
        motorSectonTest3();
        clickOnElement("//a[contains(text(),'All Parts & Accessories')]");
        Thread.sleep(2000);
    }

    @Test (enabled = false)
    public void selectCarAndTruckPartsTest5() throws InterruptedException {
        findallPartsTest4();
       // clickOnElement("body.no-touch.skin-large.flex-lg.gh-flex:nth-child(2) div.pagecontainer.srp-main--isLarge:nth-child(4) div.pagecontainer__center.PR_right_wrap div.container section.b-module.b-visualnav:nth-child(3) div.b-visualnav__grid a.b-visualnav__tile.b-visualnav__tile__default:nth-child(1) > div.b-visualnav__title");
        clickOnElement("//div[@id='w2']//li[5]//a[1]");
        Thread.sleep(1000);

    }

    @Test(enabled = false)
    public void findSignInBottonTest6() throws InterruptedException {
        clickOnElement("//a[contains(text(),'Sign in')]");
        Thread.sleep(2000);

    }

    @Test (enabled = false)
    public void sellerPageTest7() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='gh-p'][contains(text(),'Sell')]")).click();
        Thread.sleep(2000);
    }

    @Test (enabled = false)
    public void sellerItemSearchTest8() throws InterruptedException {
        sellerPageTest7();
        typeOnElement("#smac_complete", "Books");
        clickOnElement("//button[@id='hero-keyword_searchBox-2[0]']");
        Thread.sleep(2000);

    }

    @Test
    public void brandoutletTest9() throws InterruptedException{
        driver.findElement(By.xpath("//a[contains(text(),'Brand Outlet')]")).click();
        Thread.sleep(1000);

    }




}




