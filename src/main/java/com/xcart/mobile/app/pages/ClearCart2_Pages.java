package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;

public class ClearCart2_Pages extends Utility {
/*







 */

    By cartMessage =By.xpath("//h1[@id='page-title']");
    By emptyCart =By.xpath("//a[@class='clear-bag']");
    By itemDeleteMessage =By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");

    //

    public String getShoppingCartMessage(){

        return getTextFromElement(cartMessage);
    }

    public void clickOnEmptyCart(){

        clickOnElement(emptyCart);
    }

    public String getPopMessage(){

        return getTextFromAlert();
    }
    public void clickOkOnPopUpWindow(){

        acceptAlert();
    }

    public String itemDeletedMessage(){

        return getTextFromElement(itemDeleteMessage);
    }




}
