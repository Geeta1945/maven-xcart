package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;

public class ShippingText_Page extends Utility {

    By shippingText = By.xpath("//h1[@id='page-title']");

    public String getShippingText(){

    return    getTextFromElement(shippingText);

    }

}
