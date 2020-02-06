package base;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import reporting.TestLogger;

import javax.naming.Name;

public class Registration extends CommonAPI {


    @FindBy(xpath = "//a[contains(text(),'register')]")
    public static WebElement registration;

   @FindBy(name ="firstname")
    public static WebElement enterFirstName;

   @FindBy(name = "lastname")
    public static WebElement enterLastName;

   @FindBy(name = "email")
    public static WebElement enterEmail;

   @FindBy(xpath = "//input[@id='PASSWORD']")
     public static WebElement enterPassword;

   @FindBy(id = "ppaFormSbtBtn")
      public static WebElement creatAccountBotton;

   public WebElement getRegistration(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       return registration;
   }

   public WebElement getEnterFirstName(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       return enterFirstName;
   }

   public WebElement getEnterLastName(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       return enterLastName;
   }

   public WebElement getEnterEmail(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       return enterEmail;
   }

   public WebElement getEnterPassword(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       return enterPassword;
   }

   public WebElement getCreatAccountBotton(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       return creatAccountBotton;
   }

   public void clickOnRegistration(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getRegistration().click();
   }

   public void typeFirstName(String value){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getEnterFirstName().sendKeys();
   }

    public void typeLirstName(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getEnterLastName().sendKeys();
   }

    public void typeEmail(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEnterEmail().sendKeys();

    }

    public void typePassword(String value){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getEnterPassword().sendKeys();
   }

   public void clickCreateAccountBotton(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getCreatAccountBotton().click();

   }
}


