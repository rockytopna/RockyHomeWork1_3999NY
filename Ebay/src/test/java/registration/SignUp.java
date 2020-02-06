package registration;

import base.Registration;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SignUp extends CommonAPI {

    @Test (enabled = false)
    public void registrationBottonTest () {
        Registration botton = PageFactory.initElements(driver, Registration.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        botton.getRegistration().click();

    }

     @Test
     public void signUpwithincompleteInfoTest(){
         Registration email = PageFactory.initElements(driver,Registration.class);
         email.getRegistration().click();
         email.getCreatAccountBotton().click();

        }
    }


