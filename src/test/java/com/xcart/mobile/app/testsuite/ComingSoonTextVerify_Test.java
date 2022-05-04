package com.xcart.mobile.app.testsuite;

import com.xcart.mobile.app.pages.ComingSoonText_Page;
import com.xcart.mobile.app.pages.ShippingText_Page;
import com.xcart.mobile.app.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComingSoonTextVerify_Test extends TestBase {
    HomePageTest homePageTestObj = new HomePageTest();
    ComingSoonText_Page comingSoonText_pageObj = new ComingSoonText_Page();


    @Test
    public void verifyComingSoonText() throws InterruptedException {

        Thread.sleep(2000);
        homePageTestObj.clickComingSoon();
        Thread.sleep(1500);
        String actualText = comingSoonText_pageObj.getComingSoonText();
        System.out.println(actualText);
        String expectedText = "Coming soon";
        Assert.assertEquals(actualText, expectedText);


    }

}
