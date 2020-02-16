package testIphones;

import base.CommonAPI;
import iphones.Iphones;
import javafx.scene.layout.Priority;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searchPage.SearchPage;

public class TestIphones extends CommonAPI {
    @Test(priority = 1)
    public void userCanSearchIphone(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.searchIphone();
    }
    @Test(priority = 2)
    public void userCanBuyIphone6(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhoneSearch();
    }
    @Test(priority=3)
    public void searchiPhoneYellow(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhoneSearchYellow();
    }
    @Test(priority = 4)
    public void searchiphoneRed (){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iphoneRed();
    }
    @Test(priority = 5)
    public void searchiPhonePurple (){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhonePurple();
    }
    @Test(priority = 6)
    public void searchiPhoneGreen(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhoneGreen();
    }
    @Test(priority = 7)
    public void searchiPhoneWhite(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhoneWhite();
    }
    @Test(priority = 8)
    public void searchiPhoneBlack(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhoneBlack();
    }
    @Test(priority = 9)
    public void searchiPhone64GBSpaceGray(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone64GBSpaceGray();
    }
    @Test(priority = 10)
    public void searchiPhone128GBWhite(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone128GBWhite();
    }
    @Test(priority = 11)
    public void searchiPhone64GBGold(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone64GBGold();
    }
    @Test(priority = 12)
    public void searchiPhone64GBSilver() {
        Iphones search = PageFactory.initElements(driver, Iphones.class);
        search.iPhone64GBSilver();
    }
    @Test(priority = 13)
    public void searchiPhone64MidNightGreen(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone64MidNightGreen();
    }
    @Test(priority = 14)
    public void searchiPhone128GBGold(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone128GBGold();
    }
    @Test(priority = 15)
    public void searchiPhone128Black(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone128Black();
    }
    @Test(priority = 16)
    public void searchiPhone128Gold(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone128Gold();
    }
    @Test(priority = 17)
    public void searchiPhone7128GBSilver(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone7128GBSilver();
    }
    @Test(priority = 18)
    public void searchiPhone732GBGold(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone732GBGold();
    }
    @Test(priority = 19)
    public void searchiPhone732GBBlack(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone732GBBlack();
    }
    @Test(priority = 20)
    public void searchiPhone11512GBGold(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone11512GBGold();
    }
    @Test(priority = 21)
    public void searchiPhone11512GBSilver(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone11512GBSilver();
    }
    @Test(priority = 22)
        public void searchiPhone11Pro64GBSilver(){
            Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iPhone11Pro64GBSilver();
    }
    @Test(priority = 23)
    public void searchIphone4s(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iphone4s();
    }
    @Test(priority = 24)
    public void searchiphoneXRBlue(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iphoneXRBlue();
    }
    @Test(priority = 25)
    public void clickContin(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.findBatteryCase();
    }
    @Test(priority = 26)
    public void searchIphone3GS(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iphone3Gs();
    }
    @Test(priority = 27)
    public void searchIphone11(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iphone11();
    }
    @Test(priority = 28)
    public void searchIphone7(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iphone7();
    }
    @Test(priority = 29)
    public void searchIphoeGray(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iphone7Gray();
    }
    @Test(priority = 30)
    public void searchiphone7RoseGold(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iphone7RoseGold();
    }
    @Test(priority = 31)
    public void searchiphoneXR(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iphoneXR();
    }
    @Test(priority = 32)
    public void searchiphone64GB(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iphone64GB();
    }
    @Test(priority = 33)
    public void searchiphoneXRYellow(){
        Iphones search = PageFactory.initElements(driver,Iphones.class);
        search.iphoneXRYellow();
    }
}