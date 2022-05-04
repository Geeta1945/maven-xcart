package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCart_Page extends Utility {
    By textMessage = By.xpath("//h1[@id='page-title']");

    By subTotal = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]");
   By total = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[4]/span[1]/span[1]");
    By checkOutButton = By.xpath("//button[@class='btn  regular-button regular-main-button checkout']");
    public String getTextFromShoppingCartPAge()
    {
       return  getTextFromElement(textMessage);
    }

    public String getTextFromSubTotal(){

        return getTextFromElement(subTotal);
    }

    public String getTotal(){

        return getTextFromElement(total);
    }

    public void clickOnCheckOut(){

        clickOnElement(checkOutButton);
    }


}
