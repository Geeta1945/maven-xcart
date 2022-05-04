package com.xcart.mobile.app.testsuite;

import com.xcart.mobile.app.pages.ShippingText_Page;
import com.xcart.mobile.app.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShippingPageTextVerify_Test extends TestBase {

    HomePageTest homePageTestObj = new HomePageTest();
    ShippingText_Page shippingText_pageObj = new ShippingText_Page();

    @Test
    public void verifyShippingText() throws InterruptedException {

        Thread.sleep(2000);
        homePageTestObj.clickOnShipping();
        Thread.sleep(1500);
        String actualText = shippingText_pageObj.getShippingText();
        System.out.println(actualText);
        String expectedText = "Shipping";
        Assert.assertEquals(actualText, expectedText);


    }

}
