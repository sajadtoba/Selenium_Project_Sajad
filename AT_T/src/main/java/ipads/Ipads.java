package ipads;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ipads extends CommonAPI {

    @FindBy(name = "q")
    WebElement searchBar;
    @FindBy(css = "button[class='btn-search search-active-mobile search-active']")
    WebElement searchBtn;

    public void searchIpad() {
        searchBar.sendKeys("Apple iPad Air (3rd generation) - 64GB - Gold");
        searchBtn.click();
    }

    public void iPadMini() {
        searchBar.sendKeys("Apple iPad mini (5th generation) - 64GB - Gold");
        searchBtn.click();
    }

    public void iPadPro() {
        searchBar.sendKeys("Apple iPad Pro 11-inch - 1TB - Space Gray");
        searchBtn.click();
    }

    public void iPadProGray() {
        searchBar.sendKeys("Apple iPad Pro 11-inch - 512GB - Space Gray");
        searchBtn.click();
    }

    public void iPadProGray256GB() {
        searchBar.sendKeys("Apple iPad Air (3rd generation) - 256GB - Space Gray");
        searchBtn.click();
    }

    public void iPadAir256GBGold() {
        searchBar.sendKeys("Apple iPad Air (3rd generation) - 256GB - Gold");
        searchBtn.click();
    }

    public void iPadAir64GBGold() {
        searchBar.sendKeys("Apple iPad Air (3rd generation) - 64GB - Gold");
        searchBtn.click();
    }

    public void iPadMine5Generation() {
        searchBar.sendKeys("Apple iPad mini (5th generation) - 64GB - Space Gray");
        searchBtn.click();
    }

    public void iPad7thGeneration32SpaceGray() {
        searchBar.sendKeys("Apple iPad 10.2-inch (7th generation) - 32GB - Space Gray");
        searchBtn.click();
    }

    public void iPad7thGeneration128GBSpaceGray() {
        searchBar.sendKeys("Apple iPad 10.2-inch (7th generation) - 128GB - Space Gray");
        searchBtn.click();
    }

    public void iPad3rdGeneration256GBSilver() {
        searchBar.sendKeys("Apple iPad Pro 12.9-inch (3rd generation) - 256GB - Silver");
        searchBtn.click();
    }

    public void iPadCablesBundle() {
        searchBar.sendKeys("AT&T 3 Cable Bundle (9in/4ft/6ft) - Micro USB");
        searchBtn.click();
    }
    public void iPad3rdGeneration512GBSilver() {
        searchBar.sendKeys("Apple iPad Pro 12.9-inch (3rd generation) - 512GB - Silver");
        searchBtn.click();
    }


    public void iPadLogitechPencil() {
        searchBar.sendKeys("Logitech Crayon Digital Pencil for iPad - Silver");
        searchBtn.click();
    }

    public void iPadPencil() {
        searchBar.sendKeys("Apple Pencil for iPad");
        searchBtn.click();
    }

    public void PelicanBlackVoyager() {
        searchBar.sendKeys("Pelican Black Voyager Case with Kickstand Pencil Compatible - 11-inch iPad Pro");
        searchBtn.click();
    }

    public void iPadPro11Inch() {
        searchBar.sendKeys("Apple iPad Pro 11-inch - 1TB - Silver");
        searchBtn.click();
    }

    public void iPadPro11Inch512GB() {
        searchBar.sendKeys("Apple iPad Pro 11-inch - 512GB - Space Gray");
        searchBtn.click();
    }

    public void iPadPro11Inch64GB() {
        searchBar.sendKeys("Apple iPad Pro 11-inch - 64GB - Silver");
        searchBtn.click();
    }










    }