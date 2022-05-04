package com.xcart.mobile.app.testsuite;

import com.xcart.mobile.app.pages.Final_Invoice_Page;
import com.xcart.mobile.app.testbase.TestBase;
import org.testng.annotations.Test;

public class Final_Invoice_Test extends TestBase {
    ShippingAddress_Test shippingAddress_testObj = new ShippingAddress_Test();
    Final_Invoice_Page final_invoice_pageObj = new Final_Invoice_Page();

    @Test
    public void CheckTheThankYouMessageDisplayed() throws InterruptedException{

        shippingAddress_testObj.fillOutShippingAddress();
        final_invoice_pageObj.getThankYouMessage();



    }

}
