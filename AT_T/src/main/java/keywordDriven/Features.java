package keywordDriven;

import base.CommonAPI;
import ipads.Ipads;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features extends CommonAPI {
    Ipads ipads = PageFactory.initElements(driver, Ipads.class);

    public void clickIpads() throws InterruptedException {
        ipads.searchIpad();
    }

    public void searchIpadPro() throws InterruptedException {
        ipads.iPadPro();
    }

    public void searchIpadMin() throws InterruptedException {
        ipads.iPadMini();
    }

    public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException, InvalidArgumentException {
        switch (featureName) {
            case "clickIpads":
                clickIpads();
                break;
            case "searchIpadPro":
                searchIpadPro();
                break;
            case "searchIpadMin":
                searchIpadMin();
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }


    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        ItemToBeSearched search = new ItemToBeSearched();
        String [] testSteps = search.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
