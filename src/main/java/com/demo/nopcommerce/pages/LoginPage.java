package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Pradip
 */
//login page class extends utility class to use properties of utility class
public class LoginPage extends Utility {
    //locators for each elements on login page
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By clickOnLogin = By.xpath("//input[@class='button-1 login-button']");
    By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By welcomeToOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    //below all methods for each elements and doing actions on that each elements
    public void enterEmailId() {
        sendTextToElement(emailField, "dhanno@gmail.com");
    }

    public void enterPassword() {
        sendTextToElement(passwordField, "123456");
    }

    public void setClickOnLoginButton() {
        clickOnElement(clickOnLogin);

    }

    public String getWelcomeMessage() {
        return getTextFromElement(welcomeMessage);

    }

    public String welcomeToStore() {
        return getTextFromElement(welcomeToOurStore);
    }

    public void waitForVisibilityToseeElement() {
        waitUntilVisibilityOfElementLocated(emailField, 10);
    }


}
