package com.xcart.mobile.app.testsuite;

import com.google.common.base.Verify;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.xcart.mobile.app.pages.ShoppingCart_Page;
import com.xcart.mobile.app.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCart_Test extends TestBase {

    PlaceOrder_Test placeOrder_testObj = new PlaceOrder_Test();
    ShoppingCart_Page shoppingCart_page = new ShoppingCart_Page();


    @Test
    public void CheckDetailsOfItemAddedToCart() throws InterruptedException {


        placeOrder_testObj.verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlled();

        // 1.9 Verify the text “Your shopping cart - 1 item”
        String cartMessage = shoppingCart_page.getTextFromShoppingCartPAge();
        String cartExpectedMessage = "Your shopping cart - 1 item";
        Assert.assertEquals(cartMessage,cartExpectedMessage);
        Thread.sleep(1000);

        // 1.10 Verify the Subtotal $299.00

        String subTotalFromWebPage = shoppingCart_page.getTextFromSubTotal();
        System.out.println(subTotalFromWebPage);
        String expectedSubTotal = "$299.00";
        Assert.assertEquals(subTotalFromWebPage,expectedSubTotal);

      //  1.11 Verify the total $309.73 -$309.73

        String totalAmountFromWebPage = shoppingCart_page.getTotal();
        String  expectedTotal = "$309.73";
        System.out.println(totalAmountFromWebPage);
        Assert.assertEquals(totalAmountFromWebPage,expectedTotal);

        Thread.sleep(1000);

        //     1.12 Click on “Go to checkout” button

            shoppingCart_page.clickOnCheckOut();




    }
}
