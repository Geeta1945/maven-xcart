package com.xcart.mobile.app.testsuite;

import com.google.common.base.Verify;
import com.xcart.mobile.app.pages.ShippingAddress_Page;
import com.xcart.mobile.app.pages.ShoppingCart_Page;
import com.xcart.mobile.app.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShippingAddress_Test extends TestBase {

    LoginToYourAccount_Test loginToYourAccount_testObj = new LoginToYourAccount_Test();
    ShippingAddress_Page shippingAddress_pageObj = new ShippingAddress_Page();

    @Test
    public void fillOutShippingAddress() throws InterruptedException {

        // 1.16 Verify the text “Secure Checkout”
        Thread.sleep(3000);
        loginToYourAccount_testObj.checkloginworking();
        String secureTitle = shippingAddress_pageObj.getTitle();
        String expectedTitle = "Secure Checkout";
        Assert.assertEquals(secureTitle, expectedTitle);

        //  1.17 Fill all the mandatory fields
        shippingAddress_pageObj.sendFirstName("Joe");
        shippingAddress_pageObj.sendLastName("Smith");
        shippingAddress_pageObj.sendAddress("100 Down Street");
        shippingAddress_pageObj.sendCity("Edinburgh");
        Thread.sleep(1000);
        shippingAddress_pageObj.selectCountryFromDropDown("United Kingdom");
        Thread.sleep(1000);
        shippingAddress_pageObj.sendState("My State");
        shippingAddress_pageObj.sendZipCode("1");

        Thread.sleep(500);
        //  //1.18 Check the check box “Create an account for later use”
        shippingAddress_pageObj.clickOnCreateAccountBox();
        Thread.sleep(500);

        //1.19 Enter the password

        shippingAddress_pageObj.enterPassword("mySecretPassword123");
        Thread.sleep(1000);


        //1.20 Select the Delivery Method to “Local Shipping”
        shippingAddress_pageObj.clickOnLocalShipping();
        Thread.sleep(1000);

        //1.21 Select Payment Method “COD”
        shippingAddress_pageObj.clickPaymentMethod();
        Thread.sleep(1000);

        //1.22 Verify the total $311.03
        String actualTotalAmount = shippingAddress_pageObj.getTotalAmount();

        String expectedTotal = "$311.03";
        Assert.assertEquals(actualTotalAmount, expectedTotal);
        Thread.sleep(1000);

        // 1.23 Click on “Place Order” Button

        shippingAddress_pageObj.clickOnPlaceOrder();


    }
}
