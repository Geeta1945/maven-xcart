package com.xcart.mobile.app.testsuite;

import com.xcart.mobile.app.pages.ClearCart_Message_2_Pages;
import com.xcart.mobile.app.testbase.TestBase;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Clear_CartMessage_2_Test extends TestBase {
   // PlaceOrder_Test placeOrder_testObj = new PlaceOrder_Test();
    ClearCart_Message_2_Pages clearCart_message_2_pagesObj = new ClearCart_Message_2_Pages();
    Clear_Cart_Empty_2_Test clear_cart_empty_2_test =new Clear_Cart_Empty_2_Test();


    @Test

    public void isEmptyCartMessageDisplayed()  throws InterruptedException{

        Thread.sleep(2000);
       clear_cart_empty_2_test.clearCartProcedure();


      // placeOrder_testObj.verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlled();

       Thread.sleep(2000);

       String message = clearCart_message_2_pagesObj.isCartEmptyMessageDisplayed();
       Thread.sleep(1000);
       String expectedMessage = "Your cart is empty";
        Assert.assertEquals(message,expectedMessage);



    }

}
