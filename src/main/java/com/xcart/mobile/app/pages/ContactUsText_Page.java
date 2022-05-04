package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;

public class ContactUsText_Page extends Utility {

    By contactUsText =By.xpath("//h1[@id='page-title']");

    public String getContactText(){
        return getTextFromElement(contactUsText);
    }
}
