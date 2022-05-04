package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;

public class Final_Invoice_Page extends Utility {

    By thankYouMessage =By.xpath("//h1[@id='page-title']");


    public String getThankYouMessage(){

        return getTextFromElement(thankYouMessage);
    }
}
