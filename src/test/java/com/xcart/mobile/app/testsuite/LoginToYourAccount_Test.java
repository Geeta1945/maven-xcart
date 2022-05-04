package com.xcart.mobile.app.testsuite;

import com.xcart.mobile.app.pages.LoginToYourAccount_Page;
import com.xcart.mobile.app.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToYourAccount_Test extends TestBase {

    ShoppingCart_Test shoppingCart_testObj = new ShoppingCart_Test();
    LoginToYourAccount_Page loginToYourAccount_pageObj = new LoginToYourAccount_Page();

    @Test
    public void checkloginworking () throws InterruptedException {

         /*
        1.16 Verify the text “Secure Checkout”
        1.17 Fill all the mandatory fields
        1.18 Check the check box “Create an account for later use”
        1.19 Enter the password

         */
        //calling method from ShoppingCart_Test class by creating object
        Thread.sleep(1000);
        shoppingCart_testObj.CheckDetailsOfItemAddedToCart();

        // 1.13 Verify the text “Log in to your account”
        String LoginText =loginToYourAccount_pageObj.getTextFromLogInPage();
        String expectedText = "Log in to your account";
        Assert.assertEquals(LoginText,expectedText);

        // 1.14 Enter Email address
        loginToYourAccount_pageObj.sendEmailAddressToRegister("ppatel4@yahoo.com");

        //1.15 Click on “Continue” Button
        loginToYourAccount_pageObj.clickOnContinue();


    }

}
