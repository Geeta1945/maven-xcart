package com.xcart.mobile.app.testsuite;

import com.xcart.mobile.app.pages.HomePage;
import com.xcart.mobile.app.pages.HotDeals_Page;
import com.xcart.mobile.app.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class VerifyHotDealsProducts_Test extends TestBase {
    HomePage homePageObj = new HomePage();
    HotDeals_Page hotDeals_pageObj = new HotDeals_Page();

    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        Thread.sleep(2500);
        homePageObj.mouseHover_HotDeals();
        Thread.sleep(1000);
        homePageObj.mouseOverAndClick_OnSale();
        Thread.sleep(3000);

        String actualMessage = hotDeals_pageObj.getTextSale();
        Thread.sleep(3000);
        System.out.println(actualMessage);
        String expectedMessage = "Sale";

        Assert.assertEquals(expectedMessage, actualMessage);
        Thread.sleep(2000);
        hotDeals_pageObj.mouseHoverSortBy();
        Thread.sleep(1500);
        hotDeals_pageObj.clickSortByAtoZ();

    }


}
