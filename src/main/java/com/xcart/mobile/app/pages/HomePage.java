package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By hotDeals = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]");
    By sale =By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]");

    By shipping = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]/span[1]");
    By newOption = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]/a[1]");

    By comingSoon = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]");

    By contactUs = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]");

    By bestSeller =By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]");
    //click on shipping from top menu
    public void clickOnShipping(){
        clickOnElement(shipping);

    }

    //click on new! from top menu
    public void clickOnNewOption(){
        clickOnElement(newOption);

    }

    //click on coming Soon from top menu
    public void clickComingSoon(){
        clickOnElement(comingSoon);

    }

    //click on contactUs from top menu
    public void clickContactUs(){
        clickOnElement(contactUs);

    }

    public void mouseHover_BestSellers(){
        mouseHoverToElementAndClick(bestSeller);
    }



    // click on hot deal
    public void mouseHover_HotDeals(){

        mouseHoverToElement(hotDeals);

    }
    public void mouseOverAndClick_OnSale(){
        mouseHoverToElementAndClick(sale);
    }


}
