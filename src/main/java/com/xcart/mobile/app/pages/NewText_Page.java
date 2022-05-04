package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;

public class NewText_Page extends Utility {
By newText =By.xpath("//h1[@id='page-title']");

public String getNewText(){

    return getTextFromElement(newText);
}

}
