package com.xcart.mobile.app.testsuite;

import com.xcart.mobile.app.pages.NewText_Page;
import com.xcart.mobile.app.pages.ShippingText_Page;
import com.xcart.mobile.app.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewArriavalTextVerify_Test extends TestBase {
    HomePageTest homePageTestObj = new HomePageTest();
    NewText_Page newText_pageObj = new NewText_Page();

    @Test
    public void verifyShippingText() throws InterruptedException {

        Thread.sleep(2000);
        homePageTestObj.clickOnNew();
        Thread.sleep(1500);
        String actualText = newText_pageObj.getNewText();
        System.out.println(actualText);
        String expectedText = "New arrivals";
        Assert.assertEquals(actualText, expectedText);


    }

}
