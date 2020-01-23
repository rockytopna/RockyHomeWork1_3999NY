package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {

    @Test
    public void supSewLogoTest1 () throws InterruptedException{
        clickOnElement("ul#menu-top-menu  a[target='_blank']");
        Thread.sleep(1000);

    }


}
