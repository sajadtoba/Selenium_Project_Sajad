package testIpads;

import base.CommonAPI;
import ipads.Ipads;
import iphones.Iphones;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestIpads extends CommonAPI {
    @Test(priority = 1)
    public void userCanSearchIpads() {
        Ipads search = PageFactory.initElements(driver, Ipads.class);
        search.searchIpad();
    }
    @Test(priority = 2)
    public void userCanSearchIpadsMini() {
        Ipads search = PageFactory.initElements(driver, Ipads.class);
        search.iPadMini();
    }
    @Test(priority = 3)
    public void userCanSearchIpadsGray() {
        Ipads search = PageFactory.initElements(driver, Ipads.class);
        search.iPadPro();
    }
    @Test(priority = 4)
    public void userCanSearchiPadProGray() {
        Ipads search = PageFactory.initElements(driver, Ipads.class);
        search.iPadProGray();
    }
    @Test(priority = 5)
    public void userCanSearchiPadProGray256GB() {
        Ipads search = PageFactory.initElements(driver, Ipads.class);
        search.iPadProGray256GB();
    }
    @Test(priority = 6)
    public void userCanSearchiPadAir256GBGold() {
        Ipads search = PageFactory.initElements(driver, Ipads.class);
        search.iPadAir256GBGold();
    }
    @Test(priority = 7)
    public void userCanSearchiPadAir64GBGold() {
        Ipads search = PageFactory.initElements(driver, Ipads.class);
        search.iPadAir64GBGold();
    }
    @Test(priority = 8)
    public void userCanSearchiPadPro64SpaceG() {
        Ipads search = PageFactory.initElements(driver, Ipads.class);
        search.iPadMine5Generation();
    }
    @Test(priority = 9)
    public void userCanSearchiPad7thGeneration32SpaceGray() {
        Ipads search = PageFactory.initElements(driver, Ipads.class);
        search.iPad7thGeneration32SpaceGray();
    }
    @Test(priority = 11)
    public void userCanSearchiPad7thGeneration128GBSpaceGray() {
        Ipads search = PageFactory.initElements(driver, Ipads.class);
        search.iPad7thGeneration128GBSpaceGray();
    }
    @Test(priority = 12)
    public void userCanSearchiPad3rdGeneration256GBSilver() {
        Ipads search = PageFactory.initElements(driver, Ipads.class);
        search.iPad3rdGeneration256GBSilver();
    }
    @Test(priority = 13)
    public void userCanSearchiPad3rdGeneration512GBSilver() {
        Ipads search = PageFactory.initElements(driver, Ipads.class);
        search.iPad3rdGeneration512GBSilver();
    }
//    @Test(priority = 14)
//    public void userCanSearchiPad3rdGeneration64GBSilver() {
//        Ipads search = PageFactory.initElements(driver, Ipads.class);
//        search.iPadCablesBundle();
//    }
//    @Test(priority = 15)
//    public void userCanSearchiPadLogitechPencil() {
//        Ipads search = PageFactory.initElements(driver, Ipads.class);
//        search.iPadLogitechPencil();
//    }
//    @Test(priority = 16)
//    public void userCanSearchiPadPencil() {
//        Ipads search = PageFactory.initElements(driver, Ipads.class);
//        search.iPadPencil();
//    }
//    @Test(priority = 17)
//    public void userCanSearchPelicanBlackVoyager() {
//        Ipads search = PageFactory.initElements(driver, Ipads.class);
//        search.PelicanBlackVoyager();
//    }
//    @Test(priority = 18)
//    public void userCanSearchiPadPro11Inch() {
//        Ipads search = PageFactory.initElements(driver, Ipads.class);
//        search.iPadPro11Inch();
//    }
//    @Test(priority = 19)
//    public void userCanSearchiPadPro11Inch512GB() {
//        Ipads search = PageFactory.initElements(driver, Ipads.class);
//        search.iPadPro11Inch512GB();
//    }
//    @Test(priority = 20)
//    public void userCanSearchiPadPro11Inch64GB() {
//        Ipads search = PageFactory.initElements(driver, Ipads.class);
//        search.iPadPro11Inch64GB();
//    }









}
