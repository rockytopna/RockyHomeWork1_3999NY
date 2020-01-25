package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {

    @Test (enabled = false)
    public void supSewLogoTest1() throws InterruptedException {
        clickOnElement("ul#menu-top-menu  a[target='_blank']");
        Thread.sleep(1000);
    }

    @Test (enabled = false)
    public void signInTest2() throws InterruptedException {
        driver.get("https://ecomm.supsew.com/Login.aspx");
        driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("rockytopna@gmail.com");
        driver.findElement(By.name("txtPassword")).sendKeys("12345");
        clickOnElement("#btValIdPw");
        Thread.sleep(1000);

    }

    @Test (enabled =false)
    public void featuredProdectLookupTest3() throws InterruptedException {
        driver.findElement(By.xpath("//li[@id='menu-item-25443']//a")).click();
        Thread.sleep(1000);

    }

    @Test
    public void sendMessagetoNYOfficeTest4() throws  InterruptedException{

        driver.findElement(By.xpath("//li[@id='menu-item-134797']//a[contains(text(),'New York')]")).click();
        typeOnElement("template-contactform-name", "Tonny");
        typeOnElement("template-contactform-email", "Tonny@gmail.com");
        typeOnElement("template-contactform-phone","2124567546,");
        typeOnElement("template-contactform-message","Hello");
        clickOnElement("//button[@id='template-contactform-submit']");
        Thread.sleep(1000);


    }




}
