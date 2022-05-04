package com.xcart.mobile.app.pages;

import com.xcart.mobile.app.utility.Utility;
import org.openqa.selenium.By;

public class ShippingAddress_Page extends Utility {

    By secureText = By.xpath("//h1[@class='title']");

    By firstName =By.id("shippingaddress-firstname");//Joe
    By lastName =By.id("shippingaddress-lastname");//Smith
    By address = By.name("shippingAddress[street]");//1000 Main Street
    By city =By.id("shippingaddress-city");//Edinburgh
    By country =By.id("shippingaddress-country-code");
    By state =By.id("shippingaddress-custom-state");
    By zipCode =By.xpath("//input[@name='shippingAddress[zipcode]']");


    By createAnAccountBox = By.name("create_profile");

    By password = By.xpath("//input[@type='password']");

    By deliveryMethod = By.xpath("//input[@id='method128']");
    By paymentMethod = By.xpath("//input[@id='pmethod6']");
    By totalAmount = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/span[2]/span[1]");
    By placeOrder = By.xpath("//span[contains(text(),'Place order: $311.03')]");


    public String getTitle(){
        return getTextFromElement(secureText);
    }
    public void sendFirstName(String first_Name){
        sendTextToElement(firstName,first_Name);
    }

    public void sendLastName(String last_Name){
        sendTextToElement(lastName,last_Name);
    }

    public void sendAddress(String my_Address){
        sendTextToElement(address,my_Address);
    }
    public void sendCity(String city_Name){
       sendTextToElement(city,city_Name);
    }


    public void selectCountryFromDropDown(String my_country){

      selectByContainsTextFromDropDown(country,my_country);

    }
    public void sendState(String state_Name){
        sendTextToElement(state,state_Name);
    }

    public void sendZipCode(String zip_Code){
        sendTextToElement(zipCode,zip_Code);
    }

    //1.18 Check the check box “Create an account for later use”
    public void clickOnCreateAccountBox(){
        clickOnElement(createAnAccountBox);
    }

    //1.19 Enter the password
    public void enterPassword(String mySecretPassword){

     sendTextToElement(password,mySecretPassword);
    }

    public void clickOnLocalShipping(){

        clickOnElement(deliveryMethod);
    }
    public void clickPaymentMethod(){

        clickOnElement(paymentMethod);
    }

    public String getTotalAmount(){

        return getTextFromElement(totalAmount);
    }

    public void clickOnPlaceOrder(){

        clickOnElement(placeOrder);
    }


}
