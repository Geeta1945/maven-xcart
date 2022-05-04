package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;

public class ClearCart_Message_2_Pages extends Utility {

    By cartEmptyMessage = By.xpath("//h1[@id='page-title']");


    public String isCartEmptyMessageDisplayed(){

        return getTextFromElement(cartEmptyMessage);
    }
}
