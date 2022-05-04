package com.xcart.mobile.app.testsuite;

import com.xcart.mobile.app.pages.ContactUsText_Page;
import com.xcart.mobile.app.pages.ShippingText_Page;
import com.xcart.mobile.app.testbase.TestBase;
import com.xcart.mobile.app.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTextVerify_Test extends TestBase {
    HomePageTest homePageTestObj = new HomePageTest();
    ContactUsText_Page contactUsText_pageObj =new ContactUsText_Page();


    @Test
    public void verifyContactUsText() throws InterruptedException {

        Thread.sleep(2000);
        homePageTestObj.clickOnContactUS();
        Thread.sleep(1500);
      String actualText = contactUsText_pageObj.getContactText();
        System.out.println(actualText);
        String expectedText = "Contact us";
        Assert.assertEquals(actualText, expectedText);


    }

}
