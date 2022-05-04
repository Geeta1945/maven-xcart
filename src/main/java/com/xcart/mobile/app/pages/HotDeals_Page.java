package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HotDeals_Page extends Utility {

    By saleText = By.xpath("//h1[@id='page-title']");
    By sortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By aToZ  = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");

    /*
    List<WebElement> sortByOptions = (List<WebElement>) driver.findElement(sortBy);
        for(WebElement option : sortByOptions){

            if(option.getText().equalsIgnoreCase("Name A - Z"))

            {
                option.click();

            }
        }
     */
    public String getTextSale(){

      return  getTextFromElement(saleText);
    }

    public void mouseHoverSortBy(){

        mouseHoverToElement(sortBy);
    }

    public void clickSortByAtoZ(){
    mouseHoverToElementAndClick(aToZ);

    }

}
