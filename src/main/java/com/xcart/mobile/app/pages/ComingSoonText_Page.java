package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;

public class ComingSoonText_Page extends Utility {

    By comingSoonText =By.xpath("//h1[@id='page-title']");

    public String getComingSoonText(){

        return getTextFromElement(comingSoonText);
    }
}
