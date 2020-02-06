package test;

import base.HomePage;
import common.CommonAPI;
import dropdownsearch.*;
import opennewtab.NewTab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import reporting.TestLogger;


import java.util.ArrayList;
import java.util.List;

public class TestClass extends CommonAPI {


    @Test(enabled = false)
    public void daliyDealTabTest() {
        HomePage dailyDeal = PageFactory.initElements(driver, HomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        dailyDeal.clickOnDailyDealTab();

    }

    @Test (enabled = false)
    public void brandOutLetTabTest() {
        HomePage brandoutlet = PageFactory.initElements(driver, HomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandoutlet.clickOnDailyDealTab();

    }

    @Test (enabled = false)
    public void helpCenterTabTest(){
        HomePage helpcenter= PageFactory.initElements(driver, HomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        helpcenter.getHelpCenter();


}
    @Test
    public void searchTest(){
        HomePage search = PageFactory.initElements(driver, HomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        search.getSearchBar().sendKeys("Iphone");
        search.getSearchBotton().click();
    }


//    @Test(enabled = false)
//    public void motoSectionMousehover() throws InterruptedException {
//        HomePage element = PageFactory.initElements(driver, HomePage.class);
//        element.hoveronMotor();
//    }

    @Test(enabled = false)
    public void motorSectonTest3() throws InterruptedException {
        driver.findElement(By.className("hl-cat-nav__js-tab")).click();

    }

    @Test(enabled = false)
    public void findallPartsTest4() throws InterruptedException {
        motorSectonTest3();
        clickOnElement("//a[contains(text(),'All Parts & Accessories')]");

    }

    @Test(enabled = false)
    public void selectCarAndTruckPartsTest5() throws InterruptedException {
        findallPartsTest4();
        clickOnElement("//div[@id='w2']//li[5]//a[1]");


    }

    @Test(enabled = false)
    public void findSignInBottonTest6() throws InterruptedException {
        clickOnElement("//a[contains(text(),'Sign in')]");
        Thread.sleep(2000);

    }

    @Test(enabled = false)
    public void sellerPageTest7() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='gh-p'][contains(text(),'Sell')]")).click();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void sellerItemSearchTest8() throws InterruptedException {
        sellerPageTest7();
        typeOnElement("#smac_complete", "Books");
        clickOnElement("//button[@id='hero-keyword_searchBox-2[0]']");
        Thread.sleep(2000);

    }

    @Test(enabled = false)
    public void brandoutletTest9() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Brand Outlet')]")).click();
        Thread.sleep(1000);

    }

    @Test(enabled = false)
    public void searchingmultplalitemsTest10() throws InterruptedException {

        System.out.println(driver.getTitle());
        List<String> list = getItems();
        for (int i = 0; i < list.size(); i++) {
            clearField("gh-ac");
            typeOnElement("gh-ac", list.get(i));
            clickOnElement("gh-btn");
        }

    }

    public List<String> getItems() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("books");
        itemsList.add("iPhone");
        itemsList.add("Honey");
        itemsList.add("car");

        return itemsList;

    }

//    @Test(enabled = false)
//    public void helpandContactCenterTest11() {
//        HomePage element = PageFactory.initElements(driver, HomePage.class);
//        HomePage.getHelpAndContactCenter().click();
//    }
//
//    @Test(enabled = false)
//    public void moneyBackTest() {
//        HomePage element = PageFactory.initElements(driver, HomePage.class);
//        HomePage.getMoneyBack().click();

//    }

    @Test(enabled = false)
    public void TestAntiquesTest13() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Antiques antiques = PageFactory.initElements(driver, Antiques.class);
        antiques.AntiquePage();

    }

    @Test(enabled = false)
    public void TestAntiquesTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Art art = PageFactory.initElements(driver, Art.class);
        art.ArtPage();
    }

    @Test(enabled = false)
    public void BabyTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Baby baby = PageFactory.initElements(driver, Baby.class);
        baby.BabyPage();


    }

    @Test(enabled = false)
    public void BooksTest() {
        Books book = PageFactory.initElements(driver, Books.class);
        book.BooksPage();

    }

    @Test(enabled = false)
    public void businessAndIndustrialTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BussinessAndIndustrial bussinessAndIndustrial = PageFactory.initElements(driver, BussinessAndIndustrial.class);
        bussinessAndIndustrial.Business();
    }


    @Test(enabled = false)
    public void CameraTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CameraAndPhoto cameraAndPhoto = PageFactory.initElements(driver, CameraAndPhoto.class);
        cameraAndPhoto.CamsPage();
    }

    @Test(enabled = false)
    public void cellPageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CellPhoneAndAcc cellPhoneAndAcc = PageFactory.initElements(driver, CellPhoneAndAcc.class);
        cellPhoneAndAcc.CellPage();

    }

    @Test(enabled = false)
    public void clothAndShoesTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ClothingPage clothingPage = PageFactory.initElements(driver, ClothingPage.class);
        clothingPage.ClothingPage();
    }

    @Test(enabled = false)
    public void coinPageTest22() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CoinAndPaper coin = PageFactory.initElements(driver, CoinAndPaper.class);
        coin.coinPage();


    }

    @Test(enabled = false)
    public void collectiblesTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CollectiblesPage collect = PageFactory.initElements(driver, CollectiblesPage.class);
        collect.collectiblePage();
    }

    @Test(enabled = false)
    public void computerTabletPageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ComputerTablet computerTablet = PageFactory.initElements(driver, ComputerTablet.class);
        computerTablet.computerTabletPage();
    }

    @Test(enabled = false)
    public void consumerElectronicsTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ElectronicsPage electronicsPage = PageFactory.initElements(driver, ElectronicsPage.class);
        electronicsPage.electronicsPage();
    }

    @Test(enabled = false)
    public void craftsPageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Crafts crafts = PageFactory.initElements(driver, Crafts.class);
        crafts.electronicsPage();
    }

    @Test(enabled = false)
    public void dollsPageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DollsAndBears dollsAndBears = PageFactory.initElements(driver, DollsAndBears.class);
        dollsAndBears.dollsAndBearsPage();

    }

    @Test(enabled = false)
    public void moviePageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DvdandMovies dvdandMovies = PageFactory.initElements(driver, DvdandMovies.class);
        dvdandMovies.dvdMoviesPage();

    }

    @Test(enabled = false)
    public void ebayMotorTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Motors motors = PageFactory.initElements(driver, Motors.class);
        motors.motorPage();

    }

    @Test(enabled = false)
    public void giftCardTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GiftCardAndCoupon giftCardAndCoupon = PageFactory.initElements(driver, GiftCardAndCoupon.class);
        giftCardAndCoupon.GiftCardAndCoupon();

    }

    @Test(enabled = false)
    public void healthBeautyTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HealthandBeauty healthandBeauty = PageFactory.initElements(driver, HealthandBeauty.class);
        healthandBeauty.healthAndBeautyPage();

    }

    @Test(enabled = false)
    public void homeGargenPageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomeAndGargen homeAndGargen = PageFactory.initElements(driver, HomeAndGargen.class);
        homeAndGargen.homeAndGargen();
    }

    @Test(enabled = false)
    public void jewelryAndWatches() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        JewelryAndWatches jewelryAndWatches = PageFactory.initElements(driver, JewelryAndWatches.class);
        jewelryAndWatches.jewelryAndWatches();
    }


    @Test (enabled = false)
    public void musicPageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Music music = PageFactory.initElements(driver, Music.class);
        music.musicPage();
    }

    @Test(enabled = false)
    public void newTabTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NewTab newTab = PageFactory.initElements(driver, NewTab.class);
        newTab.newWindow();
    }

    @Test(enabled = false)
    public void musicInstrumentTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MusicInstrument musicInstrument = PageFactory.initElements(driver, MusicInstrument.class);
        musicInstrument.musicInstrumentPage();
    }

    @Test (enabled = false)
    public void petSuppliesPageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PetSupplies petSupplies = PageFactory.initElements(driver, PetSupplies.class);
        petSupplies.petSuppliesPage();

    }

    @Test (enabled = false)
    public void realEstatePageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RealEstate realEstate = PageFactory.initElements(driver, RealEstate.class);
        realEstate.realEstate();
    }

    @Test (enabled = false)
    public void specialtyServicePageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SpecilityService specilityService = PageFactory.initElements(driver, SpecilityService.class);
        specilityService.specialtyService();

    }

    @Test (enabled = false)
    public void sportingGoodPageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SportingGood sportingGood = PageFactory.initElements(driver, SportingGood.class);
        sportingGood.sportingGood();

    }

    @Test (enabled = false)
    public void FansmemberPageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SportingFanShop fanShop = PageFactory.initElements(driver, SportingFanShop.class);
        fanShop.sportingFanShop();
    }

    @Test (enabled = false)
    public void stampSearchPageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Stapms stapms = PageFactory.initElements(driver, Stapms.class);
        stapms.stampPage();

    }

    @Test (enabled = false)
    public void ticketExperienceTest42() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TicketAndExperience ticket = PageFactory.initElements(driver, TicketAndExperience.class);
        ticket.ticketExperience();

    }

    @Test (enabled = false)
    public void toysPageTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Toys toy = PageFactory.initElements(driver, Toys.class);
        toy.toysPage();

    }

    @Test (enabled = false)
    public void travelsPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Travels travels = PageFactory.initElements(driver, Travels.class);
        travels.travelsPage();
    }

}