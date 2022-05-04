package com.xcart.mobile.app.testsuite;

import com.xcart.mobile.app.pages.HomePage;
import com.xcart.mobile.app.testbase.TestBase;
import org.testng.annotations.Test;

import java.util.Collections;

public class HomePageTest extends TestBase {
    HomePage homePageObj = new HomePage();

    @Test

    public void clickOnShipping() {
        homePageObj.clickOnShipping();
    }

    @Test
    public void clickComingSoon() {
        homePageObj.clickComingSoon();

    }

    @Test
    public void clickOnNew() {
        homePageObj.clickOnNewOption();

    }

    @Test
    public void clickOnContactUS() throws InterruptedException {
        Thread.sleep(1500);
        homePageObj.clickContactUs();
    }


    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {
        homePageObj.mouseHover_HotDeals();
        Thread.sleep(1000);
        homePageObj.mouseOverAndClick_OnSale();
    }


}
