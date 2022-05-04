package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;

public class LoginToYourAccount_Page extends Utility {

    By logInText = By.xpath("//h3[text()='Log in to your account']");
    By enterEmail = By.xpath("//input[@id='email']");
    By continueButton = By.xpath("//button[@class ='btn  regular-button anonymous-continue-button submit']");

    public String getTextFromLogInPage(){

        return getTextFromElement(logInText);

    }

    public void sendEmailAddressToRegister(String emailId){
        sendTextToElement(enterEmail,emailId);
    }
    public void clickOnContinue(){

        clickOnElement(continueButton);
    }

}
