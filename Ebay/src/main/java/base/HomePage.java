package base;

import common.CommonAPI;
import org.openqa.selenium.By;
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
    public void motorSectonTest3() throws InterruptedException {
        driver.findElement(By.cssSelector(".hl-cat-nav__container > li:nth-of-type(3) > a")).click();
        Thread.sleep(2000);
    }

    @Test
    public void findallPartsTest4() throws InterruptedException {
        motorSectonTest3();
        clickOnElement("//a[contains(text(),'All Parts & Accessories')]");
        Thread.sleep(2000);
    }

    @Test
    public void selectCarAndTruckPartsTest5() throws InterruptedException {
        findallPartsTest4();
        clickOnElement("//div[@id='w2']//li[5]//a[1]");
        Thread.sleep(1000);

    }

    @Test
    public void findSignInBottonTest6() throws InterruptedException {
        clickOnElement("//a[contains(text(),'Sign in')]");
        Thread.sleep(2000);

    }

    @Test
    public void sellerPageTest7() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='gh-p'][contains(text(),'Sell')]")).click();
        Thread.sleep(2000);
    }

    @Test
    public void sellerItemSearchTest8() throws InterruptedException {
        sellerPageTest7();
        typeOnElement("#smac_complete", "Books");
        clickOnElement("//button[@id='hero-keyword_searchBox-2[0]']");
        Thread.sleep(2000);

    }

    @Test
    public void brandoutletTest9() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Brand Outlet')]")).click();
        Thread.sleep(1000);

    }


}




