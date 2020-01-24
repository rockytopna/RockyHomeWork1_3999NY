package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {

    @Test
    public void supSewLogoTest1() throws InterruptedException {
        clickOnElement("ul#menu-top-menu  a[target='_blank']");
        Thread.sleep(1000);
    }

    @Test
    public void signInTest2() throws InterruptedException {
        driver.get("https://ecomm.supsew.com/Login.aspx");
        driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("rockytopna@gmail.com");
        driver.findElement(By.name("txtPassword")).sendKeys("12345");
        clickOnElement("#btValIdPw");
        Thread.sleep(1000);

    }

    @Test
    public void featuredProdectLookupTest3() throws InterruptedException {
        driver.findElement(By.xpath("//li[@id='menu-item-25443']//a")).click();
        Thread.sleep(1000);

    }





}
