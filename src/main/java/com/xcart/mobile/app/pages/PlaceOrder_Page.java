package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;


public class PlaceOrder_Page extends Utility {
    By sortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By bestSellerText = By.xpath("//h1[@id='page-title']");
    By iPhone =By.xpath("//img[@data-src='//mobile.x-cart.com/images/product/iphonese-select-2016.png']");
    By sorByAtoZ = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
    By iphoneAddToCartButton =By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]");
    By addToCartMessage = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeMessage =By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
    By yourCart = By.xpath("//div[@title='Your cart']");
    By viewCart =By.xpath("//a[@class='regular-button cart']");

    public String getBestSellerText(){
        return getTextFromElement(bestSellerText);
    }

    public void mouseHoverSortBy(){

        mouseHoverToElement(sortBy);
    }
    public void mouseHoverIphone()
    {
        mouseHoverToElement(iPhone);
    }
    public void sortByAtoZ(){

        mouseHoverToElementAndClick(sorByAtoZ);
    }
    public void mouseHoverOnAddToCartIphone(){

        mouseHoverToElementAndClick(iphoneAddToCartButton);
    }

    public String getAddToCartMessage(){
        return getTextFromElement(addToCartMessage);
    }
    public void closeAddToCartMessage(){
        clickOnElement(closeMessage);
    }
    public void clickOnCart(){
        clickOnElement(yourCart);
    }
    public void clickOnViewCart(){

        clickOnElement(viewCart);
    }



}
