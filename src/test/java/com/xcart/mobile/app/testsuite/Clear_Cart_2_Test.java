package com.xcart.mobile.app.testsuite;

import com.xcart.mobile.app.testbase.TestBase;
import org.testng.annotations.Test;

public class Clear_Cart_2_Test extends TestBase {

    PlaceOrder_Test placeOrder_testObj = new PlaceOrder_Test();

    @Test
    public void ClearCart() throws InterruptedException{
        /*
        1.1 Mouse hover on the “Hot deals” link
		1.2 Mouse hover on the “Bestseller”  link and click
		1.3 Verify the text “Bestsellers”
		1.4 Mouse hover on “Sort By” and select “Name A-Z”
		1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
        1.6 Verify the message “Product has been added to your cart” display in  green bar
        1.7 Click on X sign to close the message
        1.8 Click on “Your cart” icon and Click on “View cart” button
         */

        // calling method created in PlaceOrder Test class to

        placeOrder_testObj.verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlled();

    }

}
