package com.xcart.mobile.app.testsuite;

import com.google.common.base.Verify;
import com.xcart.mobile.app.pages.ClearCart2_Pages;
import com.xcart.mobile.app.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Clear_Cart_Empty_2_Test extends TestBase {

    PlaceOrder_Test placeOrder_testObj = new PlaceOrder_Test();
    ClearCart2_Pages clearCart2PagesObj = new ClearCart2_Pages();



    @Test
    public void clearCartProcedure() throws InterruptedException{
        Thread.sleep(2000);
       placeOrder_testObj.verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlled();

        //1.9 Verify the text “Your shopping cart - 1 item”
        String actualCartMessage = clearCart2PagesObj.getShoppingCartMessage();

        String expectedCartMessage = "Your shopping cart - 1 item";
        Assert.assertEquals(actualCartMessage,expectedCartMessage);

        //1.10 Click on “Empty your cart” link

        clearCart2PagesObj.clickOnEmptyCart();
        Thread.sleep(1000);

        //1.11 Verify the text “Are you sure you want to clear your cart?” on alert

        String popUpMessage = clearCart2PagesObj.getPopMessage();
        System.out.println(popUpMessage);
        Thread.sleep(1000);

        String expectedClearCartMessage = "Are you sure you want to clear your cart?";

        //Assert.assertEquals(popUpMessage,expectedCartMessage);

       // 1.12 Click “Ok” on alert
        clearCart2PagesObj.clickOkOnPopUpWindow();

        //1.13 Verify the message “Item(s) deleted from your cart”

        String itemDeleteMessage = clearCart2PagesObj.itemDeletedMessage();
        String expectedDeleteMessage = "Item(s) deleted from your cart";
        Assert.assertEquals(itemDeleteMessage,expectedDeleteMessage);

       // 1.14 Verify the text “Your cart is empty”




    }


}
