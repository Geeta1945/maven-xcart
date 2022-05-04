package com.xcart.mobile.app.testsuite;

import com.google.common.base.Verify;
import com.xcart.mobile.app.pages.HomePage;
import com.xcart.mobile.app.pages.HotDeals_Page;
import com.xcart.mobile.app.pages.PlaceOrder_Page;
import com.xcart.mobile.app.pages.ShoppingCart_Page;
import com.xcart.mobile.app.testbase.TestBase;
import org.openqa.selenium.interactions.Mouse;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PlaceOrder_Test extends TestBase {
    PlaceOrder_Page placeOrder_pageObj = new PlaceOrder_Page();
    HomePage homePageObj = new HomePage();
    HotDeals_Page hotDeals_pageObj = new HotDeals_Page();
    ShoppingCart_Page shoppingCart_pageObj =new ShoppingCart_Page();


    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlled() throws InterruptedException {
        Thread.sleep(3000);
        homePageObj.mouseHover_HotDeals();
        Thread.sleep(1000);
        homePageObj.mouseHover_BestSellers();
        Thread.sleep(1000);
        String actualText = placeOrder_pageObj.getBestSellerText();
        System.out.println(actualText);
        String expectedText ="Bestsellers";
        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(1000);
        hotDeals_pageObj.mouseHoverSortBy();
        Thread.sleep(1000);
       // 1.4 Mouse hover on “Sort By” and select “Name A-Z”
       placeOrder_pageObj.sortByAtoZ();
       // 1.5 Click on “Add to cart” button of the product: "Apple iPhone SE [Options & Attributes] [Tabs]"
        Thread.sleep(1000);
        placeOrder_pageObj.mouseHoverIphone();
        Thread.sleep(500);
        placeOrder_pageObj.mouseHoverOnAddToCartIphone();


        //Product has been added to your cart
        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        String actualMessage =placeOrder_pageObj.getAddToCartMessage();
        String expectedMessage = "Product has been added to your cart";

        Assert.assertEquals(actualMessage,expectedMessage);
        Thread.sleep(500);
        //1.7 Click on X sign to close the message
        placeOrder_pageObj.closeAddToCartMessage();
        Thread.sleep(500);

        //1.8 Click on “Your cart” icon and Click on “View cart” button
        placeOrder_pageObj.clickOnCart();
        Thread.sleep(1000);
        placeOrder_pageObj.clickOnViewCart();







    }

}
