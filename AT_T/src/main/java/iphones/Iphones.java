package iphones;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Iphones extends CommonAPI {
    @FindBy(name = "q")
    WebElement searchBar;
    @FindBy(css = "button[class='btn-search search-active-mobile search-active']")
    WebElement searchBtn;

     @FindBy(how = How.XPATH,using = "//a[@class='hidden-agent']")
    WebElement further;
     @FindBy(how =How.XPATH,using = "//ul[@id='popular-makes']//a[contains(text(),'Apple')]")
     WebElement furtherContinue;

    public void searchForItem(String item) {
        searchBar.sendKeys(item);
        searchBtn.click();
    }

    public void searchIphone() {
        searchForItem("iPhone");
    }

    public void iphone6(String item) {
        searchBar.sendKeys(item);
        searchBtn.click();
    }

    public void iPhoneSearch() {
        iphone6("Apple iPhone 6s - AT&T PREPAID - Space Gray");
    }

    public void iPhoneSearchYellow() {
        searchBar.sendKeys("Apple iPhone 11 - 128GB - Yellow");
        searchBtn.click();
    }

    public void iphoneRed() {
        searchBar.sendKeys("Apple iPhone 11 - 128GB - Red");
        searchBtn.click();
    }

    public void iPhonePurple() {
        searchBar.sendKeys("SApple iPhone 11 - 256GB - Purple");
        searchBtn.click();
    }

    public void iPhoneGreen() {
        searchBar.sendKeys("Apple iPhone 11 - 128GB - Green");
        searchBtn.click();
    }

    public void iPhoneWhite() {
        searchBar.sendKeys("Apple iPhone 11 - 256GB - White");
        searchBtn.click();
    }

    public void iPhoneBlack() {
        searchBar.sendKeys("Apple iPhone 11 - 256GB - Black");
        searchBtn.click();
    }

    public void iPhone64GBSpaceGray() {
        searchBar.sendKeys("Apple iPhone 11 Pro - 64GB - Space Gray");
        searchBtn.click();
    }
    public void iPhone128GBWhite() {
        searchBar.sendKeys("Apple iPhone 11 - 128GB - White");
        searchBtn.click();
    }

    public void iPhone64GBGold() {
        searchBar.sendKeys("Apple iPhone 8 - 64GB - Gold");
        searchBtn.click();
    }

    public void iPhone64GBSilver() {
        searchBar.sendKeys("Apple iPhone 8 - 64GB - Silver");
        searchBtn.click();
    }

    public void iPhone64MidNightGreen() {
        searchBar.sendKeys("Apple iPhone 11 Pro - 64GB - Midnight Green");
        searchBtn.click();
    }

    public void iPhone8256GBGold() {
        searchBar.sendKeys("Apple iPhone 8 - 256GB - Gold");
        searchBtn.click();
    }
    public void iPhone8128GBGold() {
        searchBar.sendKeys("Apple iPhone 8 - 128GB - Gold");
        searchBtn.click();
    }
    public void iPhone8128GBSpaceGray() {
        searchBar.sendKeys("Apple iPhone 8 - 128GB - Space Gray");
        searchBtn.click();
    }
    public void iPhone128GBGold() {
        searchBar.sendKeys("Apple iPhone 8 - 128GB - Gold");
        searchBtn.click();
    }

    public void iPhone128Black() {
        searchBar.sendKeys("Apple iPhone 7 - 128GB - Black");
        searchBtn.click();
    }

    public void iPhone128Gold() {
        searchBar.sendKeys("Apple iPhone 7 - 128GB - Gold");
        searchBtn.click();
    }

    public void iPhone7128GBSilver() {
        searchBar.sendKeys("Apple iPhone 7 - 128GB - Silver");
        searchBtn.click();
    }

    public void iPhone732GBGold() {
        searchBar.sendKeys("Apple iPhone 7 - 32GB - Gold");
        searchBtn.click();
    }

    public void iPhone732GBBlack() {
        searchBar.sendKeys("Apple iPhone 7 - 32GB - Black");
        searchBtn.click();
    }

    public void iPhone11512GBGold() {
        searchBar.sendKeys("Apple iPhone 11 Pro - 512GB - Gold");
        searchBtn.click();
    }

    public void iPhone11512GBSilver() {
        searchBar.sendKeys("Apple iPhone 11 Pro - 512GB - Silver");
        searchBtn.click();
    }

    public void iPhone11Pro64GBSilver() {
        searchBar.sendKeys("Apple iPhone 11 Pro - 64GB - Silver");
        searchBtn.click();
    }
    public void iphone4s(){
        searchBar.sendKeys("Apple iPhone 4S");
        searchBtn.click();
//        further.click();
//        furtherContinue.click();
    }
    public void iphoneXSilver(){
        searchBar.sendKeys("Apple iPhone X - 64GB - Silver");
        searchBtn.click();
        further.click();
    }
    public void findBatteryCase(){
        searchBar.sendKeys("Apple White Smart Battery Case - iPhone XR");
        searchBtn.click();

    }
    public void iphone3Gs(){
        searchBar.sendKeys("iphone 3GS");
        searchBtn.click();
    }
    public void iphone11(){
        searchBar.sendKeys("IPHONE 11");
        searchBtn.click();
    }
    public void iphone7(){
        searchBar.sendKeys("Apple iPhone 7 - 32GB - Rose Gold");
        searchBtn.click();
    }
    public void iphone7Gray(){
        searchBar.sendKeys("Apple iPhone 7 Plus - 128GB - Gold (AT&T Certified Restored)");
        searchBtn.click();
    }
    public void iphone7RoseGold(){
        searchBar.sendKeys("Apple iPhone 7 - 256GB - Rose Gold (AT&T Certified Restored)");
        searchBtn.click();
    }
    public void iphoneXR(){
        searchBar.sendKeys("Apple iPhone XR - 128GB - Coral");
        searchBtn.click();
    }
    public void iphone64GB(){
        searchBar.sendKeys("Apple iPhone XR - 64GB - Coral");
        searchBtn.click();
    }

    public void iphoneXRYellow(){
        searchBar.sendKeys("Apple iPhone XR - 64GB - Yellow");
        searchBtn.click();
     }
     public void iphoneXRBlue(){
        searchBar.sendKeys("Apple iPhone XR - 128GB - Blue");
        searchBtn.click();
     }


}







