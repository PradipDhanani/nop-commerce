package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

import java.util.Random;

/**
 * Created by Pradip
 */
//register page class extends utility class to use properties of utility class
public class RegisterPage extends Utility {
    //locators for each elements on register page
    By welcomeRegisterText = By.xpath("//strong[contains(text(),'Your Personal Details')]");
    By clickOnRadio = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dayOfBirth = By.name("DateOfBirthDay");
    By dateOfBirthMonth = By.name("DateOfBirthMonth");
    By dateOfBirthYear = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By companyName = By.id("Company");
    By newsLetterCheckBox = By.id("Newsletter");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By confirmRegistrationMessage = By.className("result");

    //below all methods for each elements and doing actions on that each elements
    public String getRegisterMessage() {
        return getTextFromElement(welcomeRegisterText);
    }

    public void clickOnRadioButton() {
        clickOnElement(clickOnRadio);
    }

    public void enterFirstName() {
        sendTextToElement(firstName, "dhannorun");
    }

    public void enterLastName() {
        sendTextToElement(lastName, "run");
    }

    public void selectDayOfBirth() {
        selectByIndexFromDropDown(dayOfBirth, 4);
    }

    public void selectDateOfBirthMonth() {
        selectByVisibleTextFromDropDown(dateOfBirthMonth, "May");
    }

    public void selectDateOfBirthYear() {
        selectByVisibleTextFromDropDown(dateOfBirthYear, "1985");
    }

    public void enterEmailId() {
        enterRandomEmail(email);
    }

    public void enterCompanyName() {
        sendTextToElement(companyName, "dhanno limited");
    }

    public void selectCheckBoxOfNewsLetter() {
        clickOnElement(newsLetterCheckBox);
    }

    public void enterPassword() {
        sendTextToElement(password, "dhannorun123@");
    }

    public void enterConfirmPassword() {
        sendTextToElement(confirmPassword, "dhannorun123@");
    }

    public void ClickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String registrationCompletedMessage() {
        return getTextFromElement(confirmRegistrationMessage);
    }


}
